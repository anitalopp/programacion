package com.kiko.libreria.interfaces;

import java.util.Scanner;

import com.kike.libreria.modelo.LibroDAO;
import com.kike.libreria.utils.UtilidadesCreacionDeObjetos;
import com.kiko.libreria.entidades.Libro;

public class MenuGestionInventario {

	public void mostrarMenu() {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("******Menú Gestión de inventario******");
			System.out.println("Indique la operación a realizar ");
			System.out.println("1. Introducir libro ");
			System.out.println("2. Borrar libro");
			System.out.println("3. Salir");

			String opcionString = sc.nextLine();

			opcion = Integer.parseInt(opcionString);

			switch (opcion) {
			case 1:
				insertarLibro(sc);
				break;
			case 2:
				borrarLibro(sc);
				break;
			case 3:
				System.out.println("Volviendo a menú principal");
				return;
			default:
				System.out.println("Opción incorrecta, la elección debe ser entre 1 y 3");
			}
		} while (opcion != 3);
	}

	private void borrarLibro(Scanner sc) {
		Libro libro = UtilidadesCreacionDeObjetos.crearLibro(sc);
		LibroDAO libroDAO = new LibroDAO();
		libroDAO.borrarLibro(libro);
	}

	private void insertarLibro(Scanner sc) {
		Libro libro = UtilidadesCreacionDeObjetos.crearLibro(sc);

		System.out.println("Introduzca la cantidad de libros a insertar ");
		int cantidad = Integer.parseInt(sc.nextLine());

		LibroDAO libroDAO = new LibroDAO();
		libroDAO.insertarLibros(libro, cantidad);
	}
}
