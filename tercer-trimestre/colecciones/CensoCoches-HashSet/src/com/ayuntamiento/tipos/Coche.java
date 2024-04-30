package com.ayuntamiento.tipos;

public class Coche {

	private String marca;
	private String modelo;

	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {

		return this.marca.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		Coche coche = (Coche) o;
		if (coche.getMarca().equals(marca) && coche.getModelo().equals(modelo)) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
