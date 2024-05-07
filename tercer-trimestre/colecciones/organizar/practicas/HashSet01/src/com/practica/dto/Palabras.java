package com.practica.dto;

import java.util.Objects;

public class Palabras {

	private String palabra;

	@Override
	public String toString() {
		return palabra;
	}

	public Palabras(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(palabra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palabras other = (Palabras) obj;
		return Objects.equals(palabra, other.palabra);
	}
	
	
}
