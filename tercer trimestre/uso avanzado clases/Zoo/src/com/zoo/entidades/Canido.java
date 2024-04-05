package com.zoo.entidades;

public class Canido extends Animal {

	public Canido() {

	}

	public Canido(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}

	public void vagabundea() {
		System.out.println("Yo vagabundeo en manada");
	}

}
