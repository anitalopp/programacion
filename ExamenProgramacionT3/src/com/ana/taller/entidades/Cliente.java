package com.ana.taller.entidades;

public class Cliente {
	private String dni; 
	private String nombre; 
	private int edad;
	private String ciudad;
	
	public Cliente(String dni, String nombre, Integer edad, String ciudad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        System.out.println("Cliente creado");  
        System.out.println();
    }
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}	
}

