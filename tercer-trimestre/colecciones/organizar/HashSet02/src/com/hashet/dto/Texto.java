package com.hashet.dto;

import java.util.Objects;

public class Texto {

	String palabras;

	
	@Override
	public String toString() {
		return "Texto [palabras=" + palabras + "]";
	}

	
	public Texto(String palabras) {
		super();
		this.palabras = palabras;
	}


	@Override
	public int hashCode() {
		return Objects.hash(palabras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Texto other = (Texto) obj;
		return Objects.equals(palabras, other.palabras);
	}
	
	
}
