package com.nominas.entidades;

public class Freelance extends Trabajador {
	
	private Double horasTrabajadas;
	private Double tarifa;

	public Freelance(Integer id, String nombre, Double salario, Double impuestos, Double horasTrabajadas, Double tarifa) {
		super(id, nombre, salario, impuestos);
		
		this.horasTrabajadas = horasTrabajadas;
		this.tarifa = tarifa;
	}
	
	public Double calculosSalario() {
		return horasTrabajadas * tarifa;
	}
	
	public void reservarEspacio() {
		System.out.println("Reservando espacio para trabajador " + this.getNombre());
	}

}
