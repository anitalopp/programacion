package com.ana.alumnos.vista;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.ana.alumnos.controller.ColegioController;
import com.ana.alumnos.dtos.AlumnoDTO;
import com.ana.alumnos.model.ColegioModelo;
import com.ana.alumnos.utils.MiScanner;

public class ColegioVista {

	public void menuInsertarAlumno() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();

		System.out.println("Dígame el nombre del alumno");

		String nombreAlumno = sc.nextLine();

		System.out.println("Dígame el id del municipio");

		String idMunicipio = sc.nextLine();

		System.out.println("Dígame si es familia numerosa (1) o no (0)");

		int familiaNumerosa = sc.nextInt();

		ColegioController cc = new ColegioController();

		int resultado = cc.insertarAlumno(nombreAlumno, idMunicipio, familiaNumerosa);

		if (resultado == 1) {
			System.out.println("Se ha insertado el pedido con éxito");
		} else {
			System.err.println("Se ha producido un error al insertar el pedido.");
		}
	}

	public void menuBuscarAlumno() {
		Scanner sc = MiScanner.getInstance();

		System.out.println("Introduzca el id del alumno");
		String idAlumno = sc.nextLine();
		
		ColegioController cc = new ColegioController();


	}

	public Integer menuActualizarAlumno() throws ClassNotFoundException, SQLException {
		Scanner sc = MiScanner.getInstance();

		System.out.println("Introduzca el id del alumno");
		String idAlumno = sc.nextLine();
		
		System.out.println("Introduzca el nombre del alumno");
		String nombreAlumno = sc.nextLine();

		System.out.println("Dígame el id del municipio a actualizar");

		String idMunicipio = sc.nextLine();

		System.out.println("Dígame si es familia numerosa (1) o no (0)");

		String familiaNumerosa = sc.nextLine();

		ColegioModelo cm = new ColegioModelo();
		return cm.actualizarAlumno(idAlumno, nombreAlumno, idMunicipio, familiaNumerosa);
	
	}

	public Integer menuBorraralumno() throws ClassNotFoundException, SQLException {
		Scanner sc = MiScanner.getInstance();

		System.out.println("Introduzca el id del alumno a borrar");
		String idAlumno = sc.nextLine();
		
		ColegioModelo cm = new ColegioModelo();
		return cm.borrarAlumno(idAlumno);
	}
}
