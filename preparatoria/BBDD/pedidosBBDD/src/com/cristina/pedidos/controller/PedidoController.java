package com.cristina.pedidos.controller;

import java.sql.SQLException;
import java.util.List;

import com.cristina.pedidos.dtos.PedidoDTO;
import com.cristina.pedidos.model.PedidoModel;

public class PedidoController {

	public Integer insertarPedido(int ClienteID, int ProductoID, String Fecha, int Total)
			throws ClassNotFoundException, SQLException {

		PedidoModel pm = new PedidoModel();
		return pm.insertarPedido(ClienteID, ProductoID, Fecha, Total);
	}

	public List<PedidoDTO> buscarPedidoConFiltros(String PedidoID, String ClienteID, String nombreCliente,
			String ProductoID, String nombreProducto) throws ClassNotFoundException, SQLException {

		PedidoModel pm = new PedidoModel();

		return pm.buscarPedidoConFiltros(PedidoID, ClienteID, nombreCliente, ProductoID, nombreProducto);
	}
	
	public Integer actualizarPedido(String PedidoID, String ClienteID, String ProductoID, String Fecha, Double Total) throws ClassNotFoundException, SQLException {
	
		PedidoModel pm = new PedidoModel();
		return pm.actualizarPedido(PedidoID, ClienteID, ProductoID, Fecha, Total);
	}
	
	public Integer borrarPedido(String PedidoID) throws ClassNotFoundException, SQLException {
		
		PedidoModel pm = new PedidoModel();
		return pm.borrarPedido(PedidoID);
	}

	public static boolean existeIdCliente(Integer ClienteID) throws ClassNotFoundException, SQLException {
		
		PedidoModel pm = new PedidoModel();
		return pm.existeIdCliente(ClienteID);
	}
	
	public static boolean existeIdProducto(Integer ProductoID) throws ClassNotFoundException, SQLException {
		
		PedidoModel pm = new PedidoModel();
		return pm.existeIdProducto(ProductoID);
	}


}
