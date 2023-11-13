package com.kiko.libreria.entidades;

public class Venta {

	Libro libro;
	Cliente cliente;
	int cantidad;

	public Venta(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venta() {

	}

	public Venta(Cliente cliente, Libro libro, int cantidad) {
		this.cliente = cliente;
		this.libro = libro;
		this.cantidad = cantidad;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setlibro(Libro libro) {
		this.libro = libro;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void registraVenta() {
		// código para registrar una venta

		System.out.println("Registrando venta de cliente " + this.cliente + " del libro " + libro.titulo + " cantidad "
				+ this.cantidad);

	}
}
