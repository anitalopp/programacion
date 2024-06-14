package com.carmen.recuperacion.interfaces;

import java.util.Scanner;

import com.carmen.recuperacion.entidades.Curso;

public class MenuAltaCurso {
	
	public Curso muestraMenuAltaCurso() {
			
			Scanner scanner = new Scanner(System.in);
	        System.out.println(" **** Alta de Curso **** ");
	
	        System.out.print("Digame el id del curso: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Digame el nombre del curso: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Ingrese el precio del curso: ");
	        double precio = scanner.nextDouble();
	        scanner.nextLine();

	        return new Curso(id, nombre, precio);
	        
		}

}
