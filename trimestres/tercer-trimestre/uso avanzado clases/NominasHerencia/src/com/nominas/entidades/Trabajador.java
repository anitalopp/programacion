package com.nominas.entidades;

public class Trabajador {
	
	private Integer id;
	private String nombre;
	private Double salario;
	private Double impuestos;
	
	public Double calcularSalario() {
		return this.salario - this.impuestos;
	}
	
	public void guardarTrabajador() {
		System.out.println("Guardando trabajador " + this.nombre);
	}
	
	public void actualizarTrabajador() {
		System.out.println("Actualizando datos de trabajador " + this.nombre);
	}
	
	public void borrarTrabajador() {
		System.out.println("Buscando datos de trabajador " + this.nombre);
	}
	
	public Trabajador(Integer id, String nombre, Double salario, Double impuestos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.impuestos = impuestos;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double getImpuestos() {
		return impuestos;
	}
	
	public void setImpuestos(Double impuestos) {
		this.impuestos = impuestos;
	}
	
	

}
