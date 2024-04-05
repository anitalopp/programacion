package Contadores;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la ruta del archivo de texto
        System.out.print("Introduce la ruta del archivo de texto: ");
        String filePath = scanner.nextLine();

        // Crear instancias de las clases de contadores
        ContadorPalabras contadorPalabras = new ContadorPalabras(filePath);
        ContadorLetras contadorLetras = new ContadorLetras(filePath);
        ContadorCaracteresEspeciales contadorCaracteresEspeciales = new ContadorCaracteresEspeciales(filePath);
        ContadorEspaciosBlanco contadorEspaciosEnBlanco = new ContadorEspaciosBlanco(filePath);
        ContadorLinea contadorLineas = new ContadorLinea(filePath);
        ContadorNumeros contadorNumeros = new ContadorNumeros(filePath);

        // Obtener y mostrar los resultados de los contadores
        int totalPalabras = contadorPalabras.contarPalabras();
        int totalLetras = contadorLetras.contarLetras();
        int totalCaracteresEspeciales = contadorCaracteresEspeciales.contarCaracteresEspeciales();
        int totalEspaciosEnBlanco = contadorEspaciosEnBlanco.contarEspaciosEnBlanco();
        int totalLineas = contadorLineas.contarLineas();
        int totalNumeros = contadorNumeros.contarNumeros();

        System.out.println("El número total de palabras en el archivo es: " + totalPalabras);
        System.out.println("El número total de letras en el archivo es: " + totalLetras);
        System.out.println("El número total de caracteres especiales en el archivo es: " + totalCaracteresEspeciales);
        System.out.println("El número total de espacios en blanco en el archivo es: " + totalEspaciosEnBlanco);
        System.out.println("El número total de líneas en el archivo es: " + totalLineas);
        System.out.println("El número total de números en el archivo es: " + totalNumeros);
    }
}
