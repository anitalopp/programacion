package com.carmen.recuperacion.interfaces;

import java.util.Scanner;
import com.carmen.recuperacion.entidades.Progenitor;

public class MenuAltaProgenitor {
	
	public Progenitor muestraMenuAltaProgenitor() {
			
			Scanner scanner = new Scanner(System.in);
	        System.out.println(" **** Alta de Progenitor **** ");
	
	        System.out.print("Ingrese el nombre del progenitor: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Ingrese la edad del progenitor: ");
	        int edad = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Ingrese el sexo del progenitor (H/M): ");
	        char sexo = scanner.next().charAt(0);
	        scanner.nextLine();
	        
	        return new Progenitor(nombre, edad, sexo, null);
	        
		}

}
