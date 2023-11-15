package com.ana.hotel.entidades;

public class Habitacion {
	
	private String numPlanta;
	private String numHabitacion;
	private boolean esOcupada;
		
	public Habitacion(String numHabitacion, String numPlanta) {
        this.numHabitacion = numHabitacion;
        this.numPlanta = numPlanta;
        this.esOcupada = false;
        
    }
	
	public String getNumPlanta() {
		return numPlanta;
	}
	public void setNumPlanta(String numPlanta) {
		this.numPlanta = numPlanta;
	}
	public String getNumHabitacion() {
		return numHabitacion;
	}
	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public boolean esOcupada() {
		return esOcupada;
	}
	public void setEsOcupada(boolean esOcupada) {
		this.esOcupada = esOcupada;
	}
}



