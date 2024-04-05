package com.zoo.entidades;

public class Perro extends Canido {
	public Perro() {
	}

	public Perro(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}

	public void hazRuido() {
		System.out.println("guau, guau...");
	}

	public void come() {
		System.out.println("Yo como pienso");
	}

}
