package com.carmen.recuperacion.interfaces;

import java.util.Scanner;

import com.carmen.recuperacion.entidades.Ninho;

public class MenuAltaNinho {
	
	private Ninho ninho;
	
	public Ninho muestraMenuAltaNinho() {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println(" **** Alta de Ninho **** ");

        System.out.print("Ingrese el nombre del niño: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del niño: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el sexo del niño (H/M): ");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine();
        
        boolean discapacidad;
        
        System.out.println("¿Tiene el niño alguna discapacidad? (S/N) ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
        	discapacidad = true;
        }else {
        	discapacidad = false;
        }
        
        return new Ninho(nombre, edad, sexo, discapacidad, null);
        
	}

}
