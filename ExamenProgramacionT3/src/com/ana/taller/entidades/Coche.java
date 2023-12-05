package com.ana.taller.entidades;

import java.math.BigInteger;

public class Coche {
	private String marcaCoche;
	private Integer anoAntiguedad;
	private Neumaticos neumaticos;
	
	public Coche(String marca, BigInteger anoAntiguedad2) {
		this.marcaCoche = marca;
		this.anoAntiguedad = anoAntiguedad;
		System.out.println("Asignando coche con marca " + marca + " al cliente");  
        System.out.println();
	}

	public String getMarca() {
		return marcaCoche;
	}

	public void setMarca(String marca) {
		this.marcaCoche = marca;
	}

	public Integer getAñoAntiguedad() {
		return anoAntiguedad;
	}

	public void setAñoAntiguedad(Integer añoAntiguedad) {
		this.anoAntiguedad = añoAntiguedad;
	}

}

