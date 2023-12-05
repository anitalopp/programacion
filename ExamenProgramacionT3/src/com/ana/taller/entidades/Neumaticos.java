package com.ana.taller.entidades;

public class Neumaticos {
	private String marcaNeumaticos;
	private double precio;
	
	public Neumaticos(String marca, double precio) {
		this.marcaNeumaticos = marca;
		this.precio = precio;
		System.out.println("Neumáticos " + marca + " asignados al coche");  
        System.out.println();
	}

	public String getMarca() {
		return marcaNeumaticos;
	}

	public void setMarca(String marca) {
		this.marcaNeumaticos = marca;
	}

	public double getPrecio(double precio) {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
