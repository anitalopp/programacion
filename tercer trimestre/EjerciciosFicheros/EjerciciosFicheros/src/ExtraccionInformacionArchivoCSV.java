import java.io.*;
import java.util.*;

/*
 * Escribe un programa en Java que lea un archivo CSV 
 * con información de estudiantes (nombre, edad, 
 * calificaciones, etc.) y calcule estadísticas, como el 
 * promedio de calificaciones, la edad promedio, la cantidad 
 * de estudiantes, etc.
 */

public class ExtraccionInformacionArchivoCSV {
	
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java EstadisticasCSV <archivo_CSV>");
            return;
        }

        String archivoCSV = args[0];
        List<String[]> estudiantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                estudiantes.add(datos);
            }

            // Cálculo de estadísticas
            int cantidadEstudiantes = estudiantes.size();
            double sumaCalificaciones = 0;
            int sumaEdades = 0;
            for (String[] estudiante : estudiantes) {
                sumaCalificaciones += Double.parseDouble(estudiante[2]); // Suponiendo que la calificación está en la columna 3
                sumaEdades += Integer.parseInt(estudiante[1]); // Suponiendo que la edad está en la columna 2
            }
            double promedioCalificaciones = sumaCalificaciones / cantidadEstudiantes;
            double promedioEdades = (double) sumaEdades / cantidadEstudiantes;

            System.out.println("Estadísticas:");
            System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
            System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
            System.out.println("Promedio de edades: " + promedioEdades);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV.");
            e.printStackTrace();
        }
    }

}
