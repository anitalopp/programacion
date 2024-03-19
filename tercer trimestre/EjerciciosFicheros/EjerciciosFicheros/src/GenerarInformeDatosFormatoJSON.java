import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.*;
import java.util.*;

/*
 * Escribe un programa en Java que lea un archivo JSON 
 * con información sobre empleados (nombre, salario, 
 * departamento, etc.) y genere un informe que incluya el 
 * total de empleados, el salario promedio por departamento, 
 * y el empleado con el salario más alto y más bajo en cada 
 * departamento.
 */

public class GenerarInformeDatosFormatoJSON {
	
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java GenerarInformeDatosFormatoJSON <archivo_JSON>");
            return;
        }

        String archivoJSON = args[0];

        try (FileReader reader = new FileReader(archivoJSON)) {
            JSONParser parser = new JSONParser();
            JSONArray empleados = (JSONArray) parser.parse(reader);

            Map<String, List<Double>> salariosPorDepartamento = new HashMap<>();
            Map<String, Double> salarioMaxPorDepartamento = new HashMap<>();
            Map<String, Double> salarioMinPorDepartamento = new HashMap<>();

            for (Object obj : empleados) {
                JSONObject empleado = (JSONObject) obj;
                String departamento = (String) empleado.get("departamento");
                Double salario = null;
                try {
                    salario = Double.parseDouble(empleado.get("salario").toString());
                } catch (NumberFormatException e) {
                    System.err.println("Error: el salario para un empleado en el departamento '" + departamento + "' no es un número válido.");
                    continue; // Salta a la siguiente iteración del bucle
                }

                // Actualizar lista de salarios por departamento
                if (!salariosPorDepartamento.containsKey(departamento)) {
                    salariosPorDepartamento.put(departamento, new ArrayList<>());
                }
                salariosPorDepartamento.get(departamento).add(salario);

                // Actualizar salario máximo y mínimo por departamento
                if (!salarioMaxPorDepartamento.containsKey(departamento) || salario > salarioMaxPorDepartamento.get(departamento)) {
                    salarioMaxPorDepartamento.put(departamento, salario);
                }
                if (!salarioMinPorDepartamento.containsKey(departamento) || salario < salarioMinPorDepartamento.get(departamento)) {
                    salarioMinPorDepartamento.put(departamento, salario);
                }
            }

            // Calcular el salario promedio por departamento
            Map<String, Double> salarioPromedioPorDepartamento = new HashMap<>();
            for (Map.Entry<String, List<Double>> entry : salariosPorDepartamento.entrySet()) {
                double sumaSalarios = entry.getValue().stream().mapToDouble(Double::doubleValue).sum();
                double promedioSalarios = sumaSalarios / entry.getValue().size();
                salarioPromedioPorDepartamento.put(entry.getKey(), promedioSalarios);
            }

            // Imprimir informe
            System.out.println("Informe de empleados:");
            System.out.println("Total de empleados: " + empleados.size());
            System.out.println("Salario promedio por departamento: " + salarioPromedioPorDepartamento);
            System.out.println("Salario máximo por departamento: " + salarioMaxPorDepartamento);
            System.out.println("Salario mínimo por departamento: " + salarioMinPorDepartamento);
        } catch (IOException | ParseException e) {
            System.err.println("Error al leer el archivo JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
