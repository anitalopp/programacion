package com.ana.taller.interfaces;

import java.util.Scanner;

import com.ana.taller.entidades.Cliente;

public class MenuCreacionCliente {

	public Cliente muestraMenuCreacionCliente() {
		
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Dígame el dni del clienteww");
	        String dni = sc.nextLine();
    
	        System.out.println("Dígame el nombre del cliente");
	        String nombre = sc.nextLine();

	        System.out.println("Dígame la edad del cliente");
	        int edad = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.println("Dígame el dni del cliente");
	        String ciudad = sc.nextLine();
	        
			Cliente cliente = new Cliente(dni, nombre, edad, ciudad);
	        return cliente;
	    
	}

}
