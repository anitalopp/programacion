package com.ana.itv.interfaces;

import java.util.Scanner;

import com.ana.itv.entidades.Propietario;

public class MenuPropietario {

	public Propietario muestraMenuPropietario() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("*MENÚ CREACIÓN DE PROPIETARIO*");

	        System.out.print("Por favor, introduzca el dni del propietario: ");
	        String dni = sc.nextLine();

	        while (dni.trim().isEmpty()) {
	            System.err.println("ERROR, el dni no puede estar vacía");
	            dni = sc.nextLine();
	        }

	        System.out.print("Por favor, introduzca el nombre del propietario: ");
	        String nombre = sc.nextLine();

	        while (nombre.trim().isEmpty()) {
	            System.err.println("ERROR, el nombre no puede estar vacío");
	            nombre = sc.nextLine();
	        } 

	        System.out.print("Por favor, introduzca los apellidos del propietario: ");
	        String apellido = sc.nextLine();

	        while (apellido.trim().isEmpty()) {
	            System.err.println("ERROR, los apellidos no pueden estar vacíos");
	            apellido = sc.nextLine();
	        }
	      
	        Propietario propietario = new Propietario(dni, nombre, apellido);
	        return propietario;
	    }
	}


