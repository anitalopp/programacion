package com.ana.taller.interfaces;

import java.util.Scanner;

import com.ana.taller.entidades.Coche;
import com.ana.taller.entidades.Neumaticos;

public class MenuCreacionNeumaticos {
	public Neumaticos muestraMenuCreacionNeumaticos() {
			
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Dígame la marca de los neumáticos");
	        String marca = sc.nextLine();
    
	        System.out.print("Dígame el precio de los neumáticos");
	        double precio = sc.nextDouble();
	        
	        Neumaticos neumaticos = new Neumaticos(marca, precio);
	        return neumaticos;
	    
	}
}

