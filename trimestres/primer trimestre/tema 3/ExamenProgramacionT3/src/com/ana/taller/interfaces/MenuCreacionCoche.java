package com.ana.taller.interfaces;

import java.math.BigInteger;
import java.util.Scanner;

import com.ana.taller.entidades.Coche;

public class MenuCreacionCoche {
	public Coche muestraMenuCreacionCoche() {
			
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Dígame la marca de coche");
	        String marca = sc.nextLine();
    
	        System.out.print("Dígame el año de antiguedad del coche");
	        BigInteger anoAntiguedad = sc.nextBigInteger();

			Coche coche = new Coche(marca, anoAntiguedad);
	        return coche;
	    
	}
}

