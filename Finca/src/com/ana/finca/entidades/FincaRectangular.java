package com.ana.finca.entidades;

public class FincaRectangular {
		
    private Double ladoA;
    private Double ladoB;

    public FincaRectangular() {
	}

	public void Rectangular() {
        this.ladoA = 0.0;
        this.ladoB = 0.0;
    }

    public void Rectangular(Double ladoA, Double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public Double getLadoA() {
        return ladoA;
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public Double getLadoB() {
        return ladoB;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    public Double calculaArea() {
        return ladoA * ladoB;
    }

    public Double calculaPerimetro() {
        return 2 * (ladoA + ladoB);
    }

    public Double calculaDiagonal() {
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }

	public String getLongitud() {
		return null;
	}

	public String getAncho() {
		return null;
	}
}
