package com.zoo.entidades;

public class Animal {
	
	private String imagen;
	private Integer hambre;
	private Integer[][] limites;
	private Integer[] localizacion;
	
	public Animal() {
		
	}
	public void hazRuido() {
		System.out.println("GRRR...");
	}
	
	public void come() {
		System.out.println("como lo que pillo...");
	}
	
	public void duerme() {
		System.out.println("zzzz...");
	}
	
	public void vagabundea() {
		System.out.println("Camino en plan random...");
	}
	
	public Animal(String imagen, Integer hambre, Integer[][] limites, Integer[] localizacion) {
		super();
		this.imagen = imagen;
		this.hambre = hambre;
		this.limites = limites;
		this.localizacion = localizacion;
	}
	
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public Integer getHambre() {
		return hambre;
	}
	
	public void setHambre(Integer hambre) {
		this.hambre = hambre;
	}
	
	public Integer[][] getLimites() {
		return limites;
	}
	
	public void setLimites(Integer[][] limites) {
		this.limites = limites;
	}
	
	public Integer[] getLocalizacion() {
		return localizacion;
	}
	
	public void setLocalizacion(Integer[] localizacion) {
		this.localizacion = localizacion;
	}
	


}
