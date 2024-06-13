package com.spotify.dtos;

public class CancionDTO implements Comparable<CancionDTO>{

	private String titulo;
	private String artista;
	private String usuario;

	public CancionDTO(String titulo, String artista, String usuario) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.usuario = usuario;
	}

	public CancionDTO() {

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
		return "CancionDTO [titulo=" + titulo + ", artista=" + artista + ", usuario=" + usuario + "]";
	}

	@Override
	public int compareTo(CancionDTO o) {
		
		return this.usuario.compareTo(o.getUsuario());
	}

}
