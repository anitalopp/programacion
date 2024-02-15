package com.kike.libreria.modelo;

import com.kiko.libreria.entidades.Libro;

public class LibroDAO {

	public void insertarLibros(Libro libro, int cantidad) {
		// código para insertar Libro

		System.out.println("Se han insertado " + cantidad + " libros del libro " + libro.getTitulo());
	}

	public void borrarLibro(Libro libro) {
		// código para borrar libro

		System.out.println("Se ha borrado el libro " + libro.getTitulo() + " de la base de datos");

	}
}
