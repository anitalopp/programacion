package com.ana.itv.interfaces;

import java.util.Scanner;

import com.ana.itv.entidades.Vehiculo;

public class MenuPasarItv {

	public void mostrarMenuPasarITV(Vehiculo vehiculo) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("***Menú pasar ITV***");
		System.out.println("Elija la opción que desee ejecutar.");
		System.out.println("1. Pasar la ITV sin deficiencias.");
		System.out.println("2. Pasar la ITV con deficiencias leves.");
		System.out.println("3. No pasar la ITV.");

		int opcion = scanner.nextInt();

		switch (opcion) {
		case 1:
			vehiculo.setRevisionPasada(true);
			vehiculo.setRevisionSuperada(true);
			break;

		case 2:
			System.out.println("Introduce la deficiencia leve:");
			String deficienciaLeve = scanner.next();
			vehiculo.setDeficienciasLeves(deficienciaLeve);
			vehiculo.setRevisionPasada(true);
			vehiculo.setRevisionSuperada(true);
			break;

		case 3:
			System.out.println("Introduce la deficiencia grave:");
			String deficienciaGrave = scanner.next();
			vehiculo.setDeficienciasGraves(deficienciaGrave);

			System.out.println("Introduce la deficiencia leve:");
			String deficienciaLeve2 = scanner.next();
			vehiculo.setDeficienciasLeves(deficienciaLeve2);

			vehiculo.setRevisionPasada(true);
			vehiculo.setRevisionSuperada(false);
			break;

		default:
			System.out.println("Opción no válida");
		}
	}

	public void mostrarMenu() {
		
	}
}
