package com.cristina.pedidos.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.cristina.pedidos.utils.MiScanner;
import com.cristina.pedidos.vistas.PedidoVista;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = MiScanner.getInstance();
		int n = 0;
		do {
			System.out.println("MENÚ PRINCIPAL PARA LA BBDD PEDIDOS");
			System.out.println("===============================================");
			System.out.println("1. Insertar un pedido");
			System.out.println("2. Buscar un pedido por IDPedido, IDCliente, NombreCliente, IDProducto o NombreProducto.");
			System.out.println("3. Actualizar Pedido");
			System.out.println("4. Borrar pedido.");
			System.out.println("5. Salir de la aplicación");
			System.out.println("===============================================");

			n = Integer.parseInt(sc.nextLine());

			if (n > 5 || n < 1) {
				System.out.print("Elección invalida, inténtalo otra vez...");
				continue;
			}

			if (n == 1) {	
				PedidoVista pv = new PedidoVista();
				pv.menuInsertarPedido();
				continue;

			}
			if (n == 2) {
				PedidoVista pv = new PedidoVista();
				pv.menuBuscarPedidoConFiltros();
				continue;
			}

			if (n == 3) {
				PedidoVista pv = new PedidoVista();
				pv.menuActualizarPedido();
				continue;
			}
			
			if(n == 4) {
				PedidoVista pv = new PedidoVista();
				pv.menuBorrarPedido();
				continue;
			}
			

		} while (n != 5);
	}


	}


