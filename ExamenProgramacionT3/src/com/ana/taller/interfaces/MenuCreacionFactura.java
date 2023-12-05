package com.ana.taller.interfaces;

import java.util.Scanner;

import com.ana.taller.entidades.Cliente;
import com.ana.taller.entidades.Coche;
import com.ana.taller.entidades.Neumaticos;

public class MenuCreacionFactura {
	public void muestraMenuCreacionCoche() {
	
		int precio = 0;
		
	String nombre = null;
	String dni = null;
	String marcaNeumaticos = null;

	System.out.print("Facatura emmitida el cliente " + nombre + " con dni " + dni);
	System.out.print("Neumáticos sustituidis: " + marcaNeumaticos);
	System.out.print("Precio total " + precio);
	}

	public Object muestraMenuCreacionFactura() {
		return null;
	}
}


