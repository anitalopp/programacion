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
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", usuario=" + usuario + "]";
	}

}
