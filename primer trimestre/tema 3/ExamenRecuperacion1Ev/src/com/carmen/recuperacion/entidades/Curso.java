package com.carmen.recuperacion.entidades;



public class Curso {
	
	private int id;
	private String nombre;
	private Double precio;
	
	public double calcularDescuento(Ninho n) {
		
		double descuento = 0.0;
			
			if(n.getEdad() >= 1 && n.getEdad() <= 2) {
				descuento += 0.2;
			}else if (n.getEdad() >= 3 && n.getEdad() <= 5) {
				descuento += 0.1;
			}
			
			if(n.isDiscapacidad()) {
				descuento += 0.3;	
		}
			return this.precio - (this.precio * descuento);
	}
	
	public Curso(int id, String nombre, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
