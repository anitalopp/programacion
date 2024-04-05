package com.zoo.entidades;

public class Leon extends Felino{
	
	public Leon() {
		
	}
	public Leon(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}
	
	public void hazRuido() {
		System.out.println("Yo rujo...");
	}
	
	public void come() {
		System.out.println("Yo como lo que caza la leona");
	}

}
