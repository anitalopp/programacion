package com.cristina.pedidos.vistas;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.cristina.pedidos.controller.PedidoController;
import com.cristina.pedidos.dtos.PedidoDTO;
import com.cristina.pedidos.utils.MiScanner;

public class PedidoVista {

	public void menuInsertarPedido() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();

		int IDCliente = 0;
		boolean existeIdCliente = false;

		while (!existeIdCliente) {
			System.out.println("Dígame el ID de Cliente (debe existir en la BBDD):");

			try {
				IDCliente = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Introduce un número válido.");
			}

			if (PedidoController.existeIdCliente(IDCliente)) {
				existeIdCliente = true;
			} else {
				System.out.println("No existe el ID de Cliente.");
			}
		}

		int IdProducto = 0;
		boolean existeIdProducto = false;

		while (!existeIdProducto) {
			System.out.println("Dígame el ID de Producto (debe existir en la BBDD):");

			try {
				IdProducto = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Introduce un número válido.");
			}

			if (PedidoController.existeIdProducto(IdProducto)) {
				existeIdProducto = true;
			} else {
				System.out.println("No existe el ID de Producto.");
			}
		}

		System.out.println("Dígame la fecha:");
		String fecha = sc.nextLine();

		System.out.println("Dígame la cantidad:");
		int cantidad = Integer.parseInt(sc.nextLine());

		PedidoController pc = new PedidoController();

		int resultado = pc.insertarPedido(IDCliente, IdProducto, fecha, cantidad);

		if (resultado == 1) {
			System.out.println("Se ha insertado el pedido con éxito");
		} else {
			System.err.println("Se ha producido un error al insertar el pedido.");
		}
	}

	public void menuBuscarPedidoConFiltros() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();

		System.out.println("Introduzca el ID del pedido:");
		String IdPedido = sc.nextLine();

		System.out.println("Introduzca el ID de cliente:");
		String IdCliente = sc.nextLine();

		System.out.println("Introduzca el nombre del cliente:");
		String nombreCliente = sc.nextLine();

		System.out.println("Introduzca el ID del producto:");
		String IdProducto = sc.nextLine();

		System.out.println("Introduzca el nombre del producto:");
		String nombreProducto = sc.nextLine();

		PedidoController pc = new PedidoController();

		List<PedidoDTO> listaPedidos = pc.buscarPedidoConFiltros(IdPedido, IdCliente, nombreCliente, IdProducto,
				nombreProducto);

		for (PedidoDTO pedido2 : listaPedidos) {
			System.out.println(pedido2);
		}
	}

	public void menuActualizarPedido() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();

		System.out.println("Dígame el ID del pedido que quiere actualizar:");
		String PedidoId = sc.nextLine();

		System.out.println("Dígame el ID del Cliente a actualizar:");
		String ClienteId = sc.nextLine();

		System.out.println("Dígame el ID del Producto a actualizar:");
		String ProductoId = sc.nextLine();

		System.out.println("Dígame la fecha a actualizar:");
		String fecha = sc.nextLine();

		System.out.println("Dígame el total a actualizar:");
		Double total = Double.parseDouble(sc.nextLine());

		PedidoController pc = new PedidoController();

		int resultado = pc.actualizarPedido(PedidoId, ClienteId, ProductoId, fecha, total);

		if (resultado == 1) {
			System.out.println("Se ha actualizado el pedido con éxito");
		} else {
			System.err.println("Se ha producido un error al actualizar el pedido.");
		}
	}

	public void menuBorrarPedido() throws ClassNotFoundException, SQLException {

		Scanner sc = MiScanner.getInstance();

		System.out.println("Introduzca el ID del Pedido a borrar:");
		String IdPedido = sc.nextLine();

		PedidoController pc = new PedidoController();

		int resultado = pc.borrarPedido(IdPedido);

		if (resultado == 1) {
			System.out.println("Se ha borrado el pedido con el ID: " + IdPedido + " con éxito");
		} else {
			System.out.println("Se ha producido un error al borrar el pedido con el id: " + IdPedido);
		}
	}
}
