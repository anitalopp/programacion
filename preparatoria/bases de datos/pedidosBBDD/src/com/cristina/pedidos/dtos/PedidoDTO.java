package com.cristina.pedidos.dtos;

public class PedidoDTO {

	private String IdPedido;
	private String fecha;
	private String cantidad;
	private String nombreCliente;
	private String nombreProducto;

	

	public PedidoDTO(String idPedido, String fecha, String cantidad, String nombreCliente, String nombreProducto) {
		super();
		IdPedido = idPedido;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.nombreCliente = nombreCliente;
		this.nombreProducto = nombreProducto;
	}



	public String getIdPedido() {
		return IdPedido;
	}



	public void setIdPedido(String idPedido) {
		IdPedido = idPedido;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public String getNombreProducto() {
		return nombreProducto;
	}



	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}



	@Override
	public String toString() {
		return "PedidoDTO [IdPedido = " + IdPedido + ", fecha = " + fecha + ", cantidad = " + cantidad + ", nombreCliente = "
				+ nombreCliente + ", nombreProducto = " + nombreProducto + "]";
	}

	

	
	
	
	
}
