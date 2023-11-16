package com.ana.finca.entidades;

public class FincaCircular {
	
	public double radio;
	
	public FincaCircular() {
        this.radio = 0.0;
    }

    public FincaCircular(double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public double calculaArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * radio;
    }

	public void Circular() {		
	}
   
   
}
