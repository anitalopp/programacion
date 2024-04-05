package com.zoo.main;

import com.zoo.entidades.Perro;
import com.zoo.entidades.Animal;
import com.zoo.entidades.Leon;
import com.zoo.entidades.Lobo;
import com.zoo.entidades.Mono;

public class Main {
	
	public static void main (String args[]) {
		
		Animal perro1 = new Perro();
		Animal lobo = new Lobo();
		Animal leon = new Leon();
		Animal mono = new Mono();
		
		Animal[] arrayAnimales = new Animal [4];
		
		arrayAnimales[0] = perro1;
		arrayAnimales[1] = lobo;
		arrayAnimales[2] = leon;
		arrayAnimales[3] = mono;
		
		while (true) {
			for (Animal a : arrayAnimales) {
				a.come();
				a.vagabundea();
			}
			pinchaVacuna(arrayAnimales);
		}
		
	}
	
	public static void pinchaVacuna(Animal[] listaAnimales) {
		for(Animal a : listaAnimales) {
			System.out.println("Pinchando a " + a.getImagen());
			a.hazRuido();
		}
		
	}
}
