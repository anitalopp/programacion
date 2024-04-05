package com.zoo.entidades;

public class Mono extends Animal {
	public Mono() {
	}

	public Mono(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super(imagen, hambre, limites, localizacion);
	}

	public void hazRuido() {
		System.out.println("Yo grito...");
	}

	public void come() {
		System.out.println("Como fruta de los arboles...");
	}

}
