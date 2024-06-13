package com.ana.principal;

import java.util.Random;
import java.util.Scanner;

import com.array.utils.ArrayUtils;

public class PrincipalPrimera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int numIntroducidos = scanner.nextInt(); // lee el número introducido y lo almacena en numIntroducidos
        scanner.nextLine(); // limpia el buffer de entrada del scanner para evitar problemas al leer la siguiente entrada
        Random numeroRandom = new Random(); // crea un objeto para generar numeros aleatorios
        int arrayNumeros[] = new int[numIntroducidos]; // CREACION DEL ARRAY
        for (int i = 0; i < arrayNumeros.length; i++) {
            int numeroAleatorio = numeroRandom.nextInt(100);
            arrayNumeros[i] = numeroAleatorio;
        }

        int opcion;
        do {

            System.out.println("Elige una opción:");
            System.out.println("1. Recorrer el array y mostrar sus valores en la consola");
            System.out.println("2. Sumar los elementos del array");
            System.out.println("3. Encontrar el máximo");
            System.out.println("4. Calcular la media");
            System.out.println("5. Buscar un elemento");
            System.out.println("6. Contar ocurrencias de un elemento");
            System.out.println("7. Invertir el array (y luego imprimirlo)");
            System.out.println("8. Pedir el mismo número de elementos que el anterior elegido para crear otro array y luego compararlos");
            System.out.println("9. Ordenar el array");
            System.out.println("10. Unir dos arrays (para ello el programa tiene que pedir números para crear otro array)");
            System.out.println("11. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ArrayUtils.mostrarArray(arrayNumeros);
                    break;
                case 2:
                    int suma = ArrayUtils.sumaArray(arrayNumeros);
                    System.out.println("La suma del array es: " + suma);
                    break;
                case 3:
                    int maximo = ArrayUtils.encontrarMaximo(arrayNumeros);
                    System.out.println("El número mayor del array es: " + maximo);
                    break;
                case 4:
                    double media = ArrayUtils.calcularMedia(arrayNumeros);
                    System.out.println("La media del array es: " + media);
                    break;
                case 5:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int elementoBuscado = scanner.nextInt();
                    int posicion = ArrayUtils.buscarElemento(arrayNumeros, elementoBuscado);
                    if (posicion != -1) {
                        System.out.println("Elemento encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("Elemento no encontrado");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el elemento a contar: ");
                    int elementoContado = scanner.nextInt();
                    int ocurrencias = ArrayUtils.contarOcurrencias(arrayNumeros, elementoContado);
                    System.out.println("Ocurrencias del elemento: " + ocurrencias);
                    break;
                case 7:
                    int[] arrayInvertido = ArrayUtils.arrayInvertido(arrayNumeros);
                    System.out.println("Array invertido:");
                    ArrayUtils.mostrarArray(arrayInvertido);
                    break;
                case 8:
                    int[] nuevoArray = ArrayUtils.nuevoArray(numIntroducidos);
                    ArrayUtils.mostrarArray(nuevoArray);
                    boolean sonIguales = ArrayUtils.compararArrays(arrayNumeros, nuevoArray);
                    System.out.println("Los arrays son iguales: " + sonIguales);
                    break;
                case 9:
                    ArrayUtils.arrayOrdenado(arrayNumeros);
                    System.out.println("Array ordenado:");
                    ArrayUtils.mostrarArray(arrayNumeros);
                    break;
                case 10:
                    int[] segundoArray = ArrayUtils.nuevoArray(numIntroducidos);
                    int[] arrayConcatenado = ArrayUtils.unirArrays(arrayNumeros, segundoArray);
                    System.out.println("Arrays unidos:");
                    ArrayUtils.mostrarArray(arrayConcatenado);
                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Introduce un numero comprendido entre el 1 y el 11");
            }

        } while (opcion != 11);

        scanner.close();

    }
}

