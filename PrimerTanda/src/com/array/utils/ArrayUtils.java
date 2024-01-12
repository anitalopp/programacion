package com.array.utils;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {
	
	
	public static void mostrarArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

	public static int sumaArray(int[] array) {
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return suma;
    }
	
	public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int numero : array) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
	
	public static double calcularMedia(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int suma = sumaArray(array);
        return (double) suma / array.length;
    }
	
	 public static int buscarElemento(int[] array, int elemento) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == elemento) {
	                return i;
	            }
	        }
	        return -1;
	    }
	 
	 public static int contarOcurrencias(int[] array, int elemento) {
	        int count = 0;
	        for (int numero : array) {
	            if (numero == elemento) {
	                count++;
	            }
	        }
	        return count;
	    }
	 
	 public static int[] arrayInvertido(int[] array) {
	        int[] arrayInvertido = new int[array.length];
	        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
	            arrayInvertido[i] = array[j];
	        }
	        return arrayInvertido;
	    }
	 
	 public static int[] nuevoArray(int size) {
	        Scanner scanner = new Scanner(System.in);
	        int[] newArray = new int[size];
	        for (int i = 0; i < size; i++) {
	            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
	            newArray[i] = scanner.nextInt();
	        }
	        return newArray;
	    }
	 
	 public static boolean compararArrays(int[] array1, int[] array2) {
	        return Arrays.equals(array1, array2);
	    }
	 
	 public static void arrayOrdenado(int[] array) {
	        Arrays.sort(array);
	    }
	 
	 public static int[] unirArrays(int[] array1, int[] array2) {
	        int[] resultArray = new int[array1.length + array2.length];
	        System.arraycopy(array1, 0, resultArray, 0, array1.length);
	        System.arraycopy(array2, 0, resultArray, array1.length, array2.length);
	        return resultArray;
	    }
	  

}