package com.ana.alumnos.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.ana.alumnos.utils.MiScanner;
import com.ana.alumnos.vista.ColegioVista;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = MiScanner.getInstance();
		int n = 0;
		do {
			System.out.println("MENÚ PRINCIPAL PARA LA BBDD ALUMNOS");
			System.out.println("===============================================");
			System.out.println("1. Crear un alumno");
			System.out.println("2. Buscar un alumno por IDAlumno, nombreAlumno, nombreMunicipio");
			System.out.println("3. Actualizar un alumno, idMunicipio o familiaNumerosa");
			System.out.println("4. Borrar .");
			System.out.println("5. Salir de la aplicación");
			System.out.println("===============================================");

			n = Integer.parseInt(sc.nextLine());

			if (n > 5 || n < 1) {
				System.out.print("Elección invalida, inténtalo otra vez...");
				continue;
			}

			if (n == 1) {	
				ColegioVista pv = new ColegioVista();
				pv.menuInsertarAlumno();
				continue;

			}
			if (n == 2) {
				ColegioVista pv = new ColegioVista();
				pv.menuBuscarAlumno();
				continue;
			}

			if (n == 3) {
				ColegioVista pv = new ColegioVista();
				pv.menuActualizarAlumno();
				continue;
			}
			
			if(n == 4) {
				ColegioVista pv = new ColegioVista();
				pv.menuBorraralumno();
				continue;
			}
			

		} while (n != 5);
	}


	}