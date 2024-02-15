package com.carmen.recuperacion.entidades;

public class Progenitor extends Persona{
	
	private Ninho ninho;

	public Progenitor(String nombre, int edad, char sexo, Ninho ninho) {
		super(nombre, edad, sexo);
		this.ninho = ninho;
		System.out.println("Progenitor: " + this.getNombre() + " dado de alta.");
	}

	public Ninho getNinho() {
		return ninho;
	}

	public void setNinho(Ninho ninho) {
		this.ninho = ninho;
	}
	
	

}
