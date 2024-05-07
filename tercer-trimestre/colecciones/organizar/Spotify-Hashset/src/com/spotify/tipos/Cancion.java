package com.spotify.tipos;

public class Cancion implements Comparable<Cancion>{
	
	String titulo;
	String artista;
	String usuario;	
	
	@Override
	public int compareTo(Cancion o) {
		// TODO Auto-generated method stub
		return titulo.compareTo(o.getTitulo());
	}
	
	public Cancion(String titulo, String artista, String usuario) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.usuario = usuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean equals(Object  o) {  //Tengo que usar Object porque estoy sobreescribiendo el método de Object
		Cancion c = (Cancion) o;
		return getTitulo().equals(c.getTitulo()); // //String ya nos proporciona un método sobreescrito de equals.
	}
	
	@Override
	public int hashCode() {
		return titulo.hashCode();  //titulo es de tipo String y String tiene un metodo hashcode sobreescrito para que devuelva el mismo número (hashCode) si el String tiene el mismo contenido

	}
	
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", usuario=" + usuario + "]";
	}

}
