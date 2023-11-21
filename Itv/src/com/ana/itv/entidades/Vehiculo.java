package com.ana.itv.entidades;

public class Vehiculo {
	public Vehiculo(String matricula, String modelo, String caballos, String combustible, String deficienciasLeves,
			String deficienciasGraves, boolean revisionPasada, boolean revisionsuperada) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.caballos = caballos;
		this.combustible = combustible;
		this.deficienciasLeves = deficienciasLeves;
		this.deficienciasGraves = deficienciasGraves;
		this.revisionPAsada = revisionPasada;
		this.revisionsuperada = revisionsuperada;
	}

	private String matricula;
	private String modelo;
	private String caballos;
	private String combustible;
	private String deficienciasLeves;
	private String deficienciasGraves;
	private boolean revisionPAsada;
	private boolean revisionsuperada;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCaballos() {
		return caballos;
	}

	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getDeficienciasLeves() {
		return deficienciasLeves;
	}

	public void setDeficienciasLeves(String deficienciasLeves) {
		this.deficienciasLeves = deficienciasLeves;
	}

	public String getDeficienciasGraves() {
		return deficienciasGraves;
	}

	public void setDeficienciasGraves(String deficienciasGraves) {
		this.deficienciasGraves = deficienciasGraves;
	}

	public boolean isRevisionPAsada() {
		return revisionPAsada;
	}

	public void setRevisionPAsada(boolean revisionPAsada) {
		this.revisionPAsada = revisionPAsada;
	}

	public boolean isRevisionsuperada() {
		return revisionsuperada;
	}

	public void setRevisionsuperada(boolean revisionsuperada) {
		this.revisionsuperada = revisionsuperada;
	}

	public void metodoEspecifico() {
	}

	public double calculaPrecioITV() {
		double precioBase = 0;

		try {
			int caballos= Integer.parseInt(this.caballos);

			if (caballos <= 60) {
				precioBase = 30;
			} else if (caballos <= 120) {
				precioBase = 50;
			} else if (caballos <= 140) {
				precioBase = 55;
			} else {
				precioBase = 100;
			}
		} catch (NumberFormatException e) {
			System.err.println("Error al convertir la cantidad de caballos a un entero.");
			return -1;
		}

		if ("diesel".equalsIgnoreCase(this.combustible)) {
			precioBase *= 1.3;
		}
		return precioBase;
	}
	
	public Vehiculo(String matricula, String modelo, String caballos, String combustible) {
			super();
			this.matricula = matricula;
			this.modelo = modelo;
			this.caballos = caballos;
			this.combustible = combustible;
	System.out.println("Vehículo creado con éxito");
		}
}
