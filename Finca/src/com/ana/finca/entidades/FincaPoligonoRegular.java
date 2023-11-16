package com.ana.finca.entidades;

public class FincaPoligonoRegular {
    private Double apotema;
    private Double lado;
    private Integer numeroLados;

    public void FincaPoligono() {
        this.apotema = 0.0;
        this.lado = 0.0;
        this.numeroLados = 0;
    }

    public void FincaPoligono(Double apotema, Double lado, Integer numeroLados) {
        this.apotema = apotema;
        this.lado = lado;
        this.numeroLados = numeroLados;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Integer getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(Integer numeroLados) {
        this.numeroLados = numeroLados;
    }

    public Double calculaArea() {
        return (0.5 * this.numeroLados * this.lado * this.apotema);
    }

    public Double calculaPerimetro() {
        return this.numeroLados * this.lado;
    }

	public void Poligono() {		
	}

  
}
