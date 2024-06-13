//El programa solicitará al usuario una lista de números enteros separados por espacios en una sola línea. Luego, el programa deberá calcular y mostrar lo siguiente:
//
//La suma de todos los números ingresados.
//El mayor número ingresado.
//El menor número ingresado.
//La cantidad de números pares ingresados.
//La cantidad de números impares ingresados.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String args[]) {
        System.out.println("===EJERCICIO 3===");
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la lista de nombres separados por comas
        System.out.println("Ingrese la lista de nombres separados por comas:");
        String nombresInput = sc.nextLine();
        
        // Separar los nombres ingresados y almacenarlos en un array
        String[] nombres = nombresInput.split(",");
        
        // Contar cuántos nombres se ingresaron en total
        int cantidadNombres = nombres.length;
        System.out.println("Cantidad total de nombres ingresados: " + cantidadNombres);

        // Mostrar los nombres ordenados alfabéticamente
        Arrays.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente: " + Arrays.toString(nombres));

        // Encontrar y mostrar el nombre más largo
        String nombreMasLargo = encontrarNombreMasLargo(nombres);
        System.out.println("El nombre más largo es: " + nombreMasLargo);

        // Encontrar y mostrar el nombre más corto
        String nombreMasCorto = encontrarNombreMasCorto(nombres);
        System.out.println("El nombre más corto es: " + nombreMasCorto);

        // Contar cuántos nombres comienzan con una vocal (a, e, i, o, u)
        int nombresConVocal = contarNombresConVocal(nombres);
        System.out.println("Cantidad de nombres que comienzan con una vocal: " + nombresConVocal);

        // Contar cuántos nombres tienen una longitud mayor que la longitud promedio de todos los nombres ingresados
        double longitudPromedio = calcularLongitudPromedio(nombres);
        int nombresMayorQuePromedio = contarNombresMayorQuePromedio(nombres, longitudPromedio);
        System.out.println("Cantidad de nombres con longitud mayor que el promedio: " + nombresMayorQuePromedio);
    }

    public static String encontrarNombreMasLargo(String[] nombres) {
        String nombreMasLargo = nombres[0];
        for (String nombre : nombres) {
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }
        return nombreMasLargo;
    }

    public static String encontrarNombreMasCorto(String[] nombres) {
        String nombreMasCorto = nombres[0];
        for (String nombre : nombres) {
            if (nombre.length() < nombreMasCorto.length()) {
                nombreMasCorto = nombre;
            }
        }
        return nombreMasCorto;
    }

    public static int contarNombresConVocal(String[] nombres) {
        int count = 0;
        for (String nombre : nombres) {
            char primeraLetra = nombre.toLowerCase().charAt(0);
            if (primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i' || primeraLetra == 'o' || primeraLetra == 'u') {
                count++;
            }
        }
        return count;
    }

    public static double calcularLongitudPromedio(String[] nombres) {
        int totalCaracteres = 0;
        for (String nombre : nombres) {
            totalCaracteres += nombre.length();
        }
        return (double) totalCaracteres / nombres.length;
    }

    public static int contarNombresMayorQuePromedio(String[] nombres, double promedio) {
        int count = 0;
        for (String nombre : nombres) {
            if (nombre.length() > promedio) {
                count++;
            }
        }
        return count;
    }
}
