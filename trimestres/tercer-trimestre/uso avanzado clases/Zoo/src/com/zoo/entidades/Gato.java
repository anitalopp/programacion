package com.zoo.entidades;

public class Gato extends Felino{

	public Gato(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}
	
	public void hazRuido() {
		System.out.println("`miau, miau...");
	}
	
	public void come() {
		System.out.println("Yo como pienso");
	}

}
