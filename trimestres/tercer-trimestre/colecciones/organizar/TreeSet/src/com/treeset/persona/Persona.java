package com.treeset.persona;

public class Persona implements Comparable<Persona> {

	String nombre;
	Integer edad;

	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		return this.edad.compareTo(o.edad);
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + ", Edad:" + edad + "";
	}
	
	
}
