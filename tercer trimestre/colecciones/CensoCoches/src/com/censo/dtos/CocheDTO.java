package com.censo.dtos;

import java.util.Objects;

public class CocheDTO {

	private String marca;
	private String modelo;

	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CocheDTO other = (CocheDTO) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}


	public String toString() {
		return "CocheDTO [marca=" + marca + ", modelo=" + modelo + "]";
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


	public CocheDTO(String array, String array2) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	


	
	
	
	
	
	
}
