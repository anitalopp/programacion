package com.zoo.entidades;

public class Tigre extends Felino{

	public Tigre(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}
	
	public void hazRuido() {
		System.out.println("Yo rujo...");
	}
	
	public void come() {
		System.out.println("Yo como lo que cazo");
	}

}
