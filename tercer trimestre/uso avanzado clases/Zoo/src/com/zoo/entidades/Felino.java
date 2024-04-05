package com.zoo.entidades;

public class Felino extends Animal{
	
	public Felino() {
		
	}
	
	public Felino(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}
	
	public void vagabundea() {
		System.out.println("Yo camino solo en la vida");
	}

}
