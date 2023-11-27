package com.ana.itv.entidades;

public class Vehiculo {
	
	private String matricula;
	private String modelo;
	private String caballos;
	private String combustible;
	private String deficienciasLeves;
	private String deficienciasGraves;
	private boolean revisionPasada;
	private boolean revisionSuperada;

	  public Vehiculo(String matricula, String modelo, String caballos, String combustible,
              String deficienciasLeves, String deficienciasGraves, boolean revisionPasada, boolean revisionSuperada) {
		  this.matricula = matricula;
		  this.modelo = modelo;
		  this.caballos = caballos;
		  this.combustible = combustible;
		  this.deficienciasLeves = deficienciasLeves;
		  this.deficienciasGraves = deficienciasGraves;
		  this.revisionPasada = revisionPasada;
		  this.revisionSuperada = revisionSuperada;
}

//		public static boolean hayVehiculoCreado() {
//			return matricula != null && !matricula.isEmpty();
//		}

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

	public boolean isRevisionPasada() {
		return revisionPasada;
	}

	public void setRevisionPasada(boolean revisionPAsada) {
		this.revisionPasada = revisionPAsada;
	}

	public boolean isRevisionSuperada() {
		return revisionSuperada;
	}

	public void setRevisionSuperada(boolean revisionsuperada) {
		this.revisionSuperada = revisionsuperada;
	}

	public void metodoEspecifico() {
	}

	public double calculaPrecioITV() {

		double precioBase = 0.0;

		int caballos = Integer.parseInt(this.caballos);

		if (combustible.equalsIgnoreCase("Gasolina")) {

			if (caballos <= 60) {
				precioBase = 30;
			} else if (caballos <= 120) {
				precioBase = 50;
			} else if (caballos <= 140) {
				precioBase = 55;
			} else {
				precioBase = 100;
			}
		} else if (combustible.equalsIgnoreCase("Diesel")) {
			if (caballos <= 60) {
				precioBase = 30 * 1.3;
			} else if (caballos <= 120) {
				precioBase = 50 * 1.3;
			} else if (caballos <= 140) {
				precioBase = 55 * 1.3;
			} else {
				precioBase = 100 * 1.3;
			}
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
		System.out.println();
	}

}
