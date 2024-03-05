//El programa solicitará al usuario un número entero positivo N. 
//Luego, solicitará al usuario N palabras. El programa deberá imprimir 
//las palabras que tienen una longitud mayor que 5 caracteres 
//y contar cuántas de las palabras introducidas empiezan con la letra 'a' o 'A'.

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String args[]) {
        System.out.println("===EJERCICIO 1===");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero positivo:");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir el carácter de nueva línea
        
        String[] palabras = new String[numero];
        
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingresa la palabra número " + (i + 1) + ":");
            palabras[i] = sc.nextLine();
        }

        // Calcular la longitud promedio de las palabras ingresadas
        double longitudPromedio = calcularLongitudPromedio(palabras);
        System.out.println("La longitud promedio de las palabras ingresadas es: " + longitudPromedio);

        // Encontrar la palabra más larga
        String palabraMasLarga = encontrarPalabraMasLarga(palabras);
        System.out.println("La palabra más larga es: " + palabraMasLarga);

        // Contar cuántas palabras comienzan con una determinada letra (por ejemplo, 'a')
        char letraInicio = 'a';
        int palabrasConLetraInicio = contarPalabrasConLetraInicio(palabras, letraInicio);
        System.out.println("Cantidad de palabras que empiezan con '" + letraInicio + "': " + palabrasConLetraInicio);

        // Imprimir las palabras en orden inverso
        System.out.println("Palabras ingresadas en orden inverso:");
        imprimirEnOrdenInverso(palabras);
    }
    
    public static double calcularLongitudPromedio(String[] palabras) {
        int totalCaracteres = 0;
        for (String palabra : palabras) {
            totalCaracteres += palabra.length();
        }
        return (double) totalCaracteres / palabras.length;
    }

    public static String encontrarPalabraMasLarga(String[] palabras) {
        String palabraMasLarga = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    public static int contarPalabrasConLetraInicio(String[] palabras, char letraInicio) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.toLowerCase().charAt(0) == Character.toLowerCase(letraInicio)) {
                contador++;
            }
        }
        return contador;
    }

    public static void imprimirEnOrdenInverso(String[] palabras) {
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.println(palabras[i]);
        }
    }
}
