package com.carmen.recuperacion.entidades;

public class Ninho extends Persona{
	
	private boolean discapacidad;
	private Curso curso;
	
	public Ninho(String nombre, int edad, char sexo, boolean discapacidad, Curso curso) {
		super(nombre, edad, sexo);
		this.discapacidad = discapacidad;
		this.curso = curso;
		System.out.println("Niño con el nombre " + this.getNombre() + " dado de alta.");
	}
	
	public boolean isDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(boolean discapacidad) {
		this.discapacidad = discapacidad;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
