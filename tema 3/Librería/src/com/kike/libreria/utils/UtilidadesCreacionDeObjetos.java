package com.kike.libreria.utils;

import java.util.Scanner;

import com.kiko.libreria.entidades.Cliente;
import com.kiko.libreria.entidades.Libro;

public class UtilidadesCreacionDeObjetos {

	public static Libro crearLibro(Scanner sc) {
		System.out.println("Por favor, introduzca el título del libro");
		String titulo = sc.nextLine();

		System.out.println("Por favor, introduzca el precio del libro ");
		String autor = sc.nextLine();

		System.out.println("Por favor, introduzca el precio del libto ");
		float precio = Float.parseFloat(sc.nextLine());

		Libro libro = new Libro(titulo, autor, precio);
		return libro;
	}

	public static Cliente crearCliente(Scanner sc) {
		System.out.println("Introduzca el nombre del cliente: ");
		String nombre = sc.nextLine();

		System.out.println("Introduzca la edad del cliente: ");
		int edad = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca la ciudad del cliente: ");
		String ciudad = sc.nextLine();

		Cliente c = new Cliente(nombre, edad, ciudad);
		return c;

	}
}
