package com.ana.taller.interfaces;

import java.util.Scanner;

import com.ana.taller.entidades.Cliente;

public class MenuCreacionCliente {

	public Cliente muestraMenuCreacionCliente() {
		
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Dígame el dni del cliente");
	        String dni = sc.nextLine();
    
	        System.out.print("Dígame el nombre del cliente");
	        String nombre = sc.nextLine();

	        System.out.print("Dígame la edad del cliente");
	        int edad = sc.nextInt();
	        
	        System.out.print("Dígame el dni del cliente");
	        String ciudad = sc.nextLine();
	        
			Cliente cliente = new Cliente(dni, nombre, edad, ciudad);
	        return cliente;
	    
	}

}
