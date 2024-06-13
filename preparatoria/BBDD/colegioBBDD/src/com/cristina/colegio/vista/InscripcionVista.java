package com.cristina.colegio.vista;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.cristina.colegio.controller.InscripcionController;
import com.cristina.colegio.dtos.InscripcionDTO;
import com.cristina.colegio.utils.MiScanner;

public class InscripcionVista {

	public void inscribirEstudiante() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();
		int idEstudiante = 0;
		int idCurso = 0;
		boolean existeIdEstudiante = false;
		boolean existeIdCurso = false;
		
		// Comprobación de si existe lo que buscamos.

		while (!existeIdEstudiante) {
			System.out.println("Dígame el ID de estudiante:");
			try {
				idEstudiante = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Introduce un número válido.");
			}

			if (InscripcionController.existeIdEstudiante(idEstudiante)) {
				existeIdEstudiante = true;
			} else {
				System.out.println("No existe el ID de estudiante.");
			}
		}

		while (!existeIdCurso) {
			System.out.println("Dígame el ID de curso:");
			try {
				idCurso = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Introduce un número válido.");
			}

			if (InscripcionController.existeIdCurso(idCurso)) {
				existeIdCurso = true;
			} else {
				System.out.println("No existe el ID de curso.");
			}
		}
		
		// Aquí recogemos el método, que nos ha pasado el controller.

		InscripcionController ic = new InscripcionController();

		int resultado = ic.inscribirEstudiante(idEstudiante, idCurso);

		if (resultado == 1) {
			System.out.println("Se ha inscrito al estudiante con éxito.");
		} else {
			System.out.println("Ha ocurrido un error:");
		}
	}
	
	// Como en Vista está lo que le llega al usuario, por eso aquí preguntamos y luego responderemos por consola.

	public void buscarInscripcionConFiltros() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();

		System.out.println("Dígame el ID del curso:");
		String idCurso = sc.nextLine();

		System.out.println("Dígame el nombre del curso:");
		String nombreCurso = sc.nextLine();

		System.out.println("Dígame el ID del estudiante:");
		String idEstudiante = sc.nextLine();

		System.out.println("Dígame el nombre del estudiante:");
		String nombreEstudiante = sc.nextLine();
		
		// Una vez hechas las preguntas, recogemos el método del controller
		// Hacemos una lista, la reccorremos con un for, y la imprimimos por consola para mostrarla.

		InscripcionController ic = new InscripcionController();

		List<InscripcionDTO> listaInscripcionesFiltradas = ic.buscarInscripcionConFiltros(idCurso, nombreCurso,
				idEstudiante, nombreEstudiante);
		
		for(InscripcionDTO inscripcion: listaInscripcionesFiltradas) {
			System.out.println(inscripcion);
			System.out.println();
		}

	}
	
	public void actualizarInscripcion() throws ClassNotFoundException, SQLException {
		
		Scanner sc = MiScanner.getInstance();
		
		System.out.println("Dígame el ID de la inscripción que quiere actualizar:");
		String idInscripcion = sc.nextLine();
		
		System.out.println("Dígame la ID del estudiante:");
		String idEstudiante = sc.nextLine();
		
		System.out.println("Dígame el ID del curso:");
		String idCurso = sc.nextLine();
		
		// Igual, hacemos las preguntas, recogemos el controller y comprobamos con if si se actualicó.
		
		InscripcionController ic = new InscripcionController();
		
		int resultado = ic.actualizarInscripcion(idInscripcion, idEstudiante, idCurso);
		
		if (resultado == 1) {
			System.out.println("Se ha actualizado la inscripción con éxito");
		} else {
			System.err.println("Se ha producido un error al actualizar la inscripción.");
		}
	}
	
	
	
	public void borrarEstudiante() throws ClassNotFoundException, SQLException {
		
		Scanner sc = MiScanner.getInstance();
		
		System.out.println("Dígame el ID del estudiante a borrar:");
		String idEstudiante = sc.nextLine();
		
		// Nuevamente, hacemos las preguntas, recogemos lo que viene del controller e informamos de si se ha borrado o no.
		
		InscripcionController ic = new InscripcionController();
		
		int resultado = ic.borrarEstudiante(idEstudiante);
		
		if (resultado == 1) {
			System.out.println("Se ha borrado al estudiante con éxito");
		} else {
			System.err.println("Se ha producido un error al borrar al estudiante.");
		}
	}
}
