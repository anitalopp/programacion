package com.ana.itv.interfaces;

import com.ana.itv.entidades.Vehiculo;

import java.util.Scanner;

public class MenuCreacionVehiculo {

	public Vehiculo muestraMenuCreacionVehiculo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("*MENÚ CREACIÓN DE VEHÍCULO*");

		System.out.print("Por favor, introduzca la matrícula del vehículo: ");
		String matricula = sc.nextLine();

		while (matricula.trim().isEmpty()) {
			System.err.println("ERROR: La matrícula no puede estar vacía. Introduzca de nuevo los datos");
			matricula = sc.nextLine();
		}

		System.out.print("Por favor, introduzca el modelo del vehículo: ");
		String modelo = sc.nextLine();

		while (modelo.trim().isEmpty()) {
			System.err.println("ERROR: El modelo no puede estar vacío. Introduzca de nuevo los datos");
			modelo = sc.nextLine();
		}

		int caballos = 0;
		while (caballos <= 0) {
			System.out.print("Por favor, introduzca los caballos del vehículo: ");

			while (!sc.hasNextInt()) {
				System.err
						.println("ERROR: Los caballos deben ser un número mayor que 0. Introduzca de nuevo los datos");
				sc.next();
			}

			caballos = sc.nextInt();

			if (caballos <= 0) {
				System.err.println("ERROR: Los caballos deben ser mayores que 0");
			}
		}

		sc.nextLine();

		String combustible = "";
		while (!combustible.equals("diesel") && !combustible.equals("gasolina")) {
			System.out.print("Por favor, introduzca el combustible del vehículo (diesel o gasolina): ");
			combustible = sc.nextLine().trim().toLowerCase();

			if (!combustible.equals("diesel") && !combustible.equals("gasolina")) {
				System.err.println("ERROR: Debe introducir Diesel o Gasolina");
			}
		}

		Vehiculo vehiculo = new Vehiculo(matricula, modelo, Integer.toString(caballos), combustible);
		return vehiculo;
	}
}
