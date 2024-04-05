package com.zoo.entidades;

public class Lobo extends Canido{
	
	public Lobo() {
		
	}
	public Lobo(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}
	
	public void hazRuido() {
		System.out.println("Yo aullo...");
	}
	
	public void come() {
		System.out.println("Yo como ovejas");
	}

}
