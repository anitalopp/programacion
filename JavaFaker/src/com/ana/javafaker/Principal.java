package com.ana.javafaker;

import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
		Faker faker = new Faker ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el tamaño del array que almcanará las palabras/frases");
		int numero = sc.nextInt();
		sc.nextLine();
		String javafaker[] = new String[numero];
		
		System.out.println("introduzca la temática para rellenar el array");
		System.out.println("1.Cervezas");
		System.out.println("2.Frases de ");
		
	
	}
}
