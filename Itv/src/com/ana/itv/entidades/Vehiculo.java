package com.ana.itv.entidades;

public class Vehiculo {
	private String matricula;
	private String modelo;
	private String caballos;
	private String combustible;
	private String deficienciasLeves;
	private String deficienciasGraves;
	private boolean revisionPAsada;
	private boolean revisionsuperada;

	public Vehiculo(String matricula, String modelo, String caballos, String combustible, String deficienciasLeves,
			String deficienciasGraves, boolean revisionPAsada, boolean revisionsuperada) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.caballos = caballos;
		this.combustible = combustible;
		this.deficienciasLeves = deficienciasLeves;
		this.deficienciasGraves = deficienciasGraves;
		this.revisionPAsada = revisionPAsada;
		this.revisionsuperada = revisionsuperada;
	}

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
		// TODO Auto-generated method stub
		
	}

}
//TODO Además, tendrá un constructor con los siguientes parámetros: matrícula, modelo, caballos y combustible. El constructor, además, tendrá que emitir el siguiente mensaje cuando el objeto Vehiculo esté construido: “Vehículo creado con éxito”. Por último, tendrá un método que calculará el precio de la ITV en función de los caballos del coche y de si es diésel o gasolina (ver punto 1.3). El método se llamará calculaPrecioITV. Será público, no recibirá ningún parámetro y devolverá un double.

