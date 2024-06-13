package com.cristina.pedidos.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cristina.pedidos.dtos.PedidoDTO;
import com.cristina.pedidos.utils.DBUtils;

public class PedidoModel {

	public Integer insertarPedido(int ClienteID, int ProductoID, String Fecha, int Total)
			throws ClassNotFoundException, SQLException {

		String sql = "INSERT INTO pedidos (ClienteID, ProductoID, Fecha, Total )" + " VALUES (?, ?, ?, ?)";

		Connection con = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = con.prepareStatement(sql);

		ps.setInt(1, ClienteID);
		ps.setInt(2, ProductoID);
		ps.setString(3, Fecha);
		ps.setInt(4, Total);

		resultado = ps.executeUpdate();

		con.close();

		return resultado;
	}

	public List<PedidoDTO> buscarPedidoConFiltros(String PedidoID, String ClienteID, String nombreCliente,
			String ProductoID, String nombreProducto) throws ClassNotFoundException, SQLException {

		// Lo que tengo que MOSTRAR va en el Select y en el DTO
		// Lo que tengo que filtrar va en el WHERE
		String sql = "SELECT p.pedidoID, p.Fecha, p.Total, c.Nombre as 'NombreCliente', pr.Nombre as 'NombreProducto' FROM pedidos p "
				+ "inner join productos pr on pr.ProductoID = p.ProductoID "
				+ "inner join clientes c on c.ClienteID = p.ClienteID "
				+ "WHERE p.pedidoID like ? OR p.ClienteID like ? OR c.Nombre like ? OR pr.ProductoID like ? OR pr.Nombre like ? ";

		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, "%" + PedidoID + "%");
		ps.setString(2, "%" + ClienteID + "%");
		ps.setString(3, "%" + nombreCliente + "%");
		ps.setString(4, "%" + ProductoID + "%");
		ps.setString(5, "%" + nombreProducto + "%");

		ResultSet pedidos = ps.executeQuery();

		List<PedidoDTO> listaPedidosFiltrados = new ArrayList<>();

		while (pedidos.next()) {
			PedidoDTO p = new PedidoDTO(pedidos.getString("PedidoID"), pedidos.getString("Fecha"),
					pedidos.getString("Total"), pedidos.getString("NombreCliente"), pedidos.getString("NombreProducto"));
			listaPedidosFiltrados.add(p);
		}

		con.close();

		return listaPedidosFiltrados;
	}
	
	public Integer actualizarPedido(String PedidoID, String ClienteID, String ProductoID, String Fecha, Double Total) throws ClassNotFoundException, SQLException {
		
		String sql = "UPDATE Pedidos SET ClienteID = CASE WHEN ? = '' THEN ClienteID ELSE ? END,"
				+ "ProductoID = CASE WHEN ? = '' THEN ProductoID ELSE ? END, "
				+ "Fecha = CASE WHEN ? = '' THEN Fecha ELSE ? END, "
				+ "Total = CASE WHEN ? = '' THEN Total ELSE ? END "
				+ "WHERE PedidoID = ?";
		
		Connection connection = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = connection.prepareStatement(sql);
		
		ps.setString(1, ClienteID);
		ps.setString(2, ClienteID);
		
		ps.setString(3, ProductoID);
		ps.setString(4, ProductoID);
		
		ps.setString(5, Fecha);
		ps.setString(6, Fecha);
		
		ps.setDouble(7, Total);
		ps.setDouble(8, Total);
		
		ps.setString(9, PedidoID);
		
		resultado = ps.executeUpdate();

		connection.close();

		return resultado;

	}
	
	public Integer borrarPedido(String PedidoID) throws ClassNotFoundException, SQLException {
		
		String sql = "DELETE FROM Pedidos WHERE PedidoID = ?";
		
		Connection connection = DBUtils.conexionBBDD();
	    PreparedStatement ps = null;
	    Integer resultado = null;
	    
	    ps = connection.prepareStatement(sql);
	    ps.setString(1, PedidoID);
	    
	    resultado = ps.executeUpdate();
	    
	    connection.close();
	    
	    return resultado;
	}
	
	public boolean existeIdCliente(Integer ClienteID) throws ClassNotFoundException, SQLException {
		
		String sql = "SELECT 1 FROM Clientes WHERE ClienteID = ? LIMIT 1";
		
		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, ClienteID);
		
		ResultSet rs = ps.executeQuery();
		
		return rs.next();
	}
	
public boolean existeIdProducto(Integer ProductoID) throws ClassNotFoundException, SQLException {
		
		String sql = "SELECT 1 FROM Productos WHERE ProductoID = ? LIMIT 1";
		
		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, ProductoID);
		
		ResultSet rs = ps.executeQuery();
		
		return rs.next();
	}
}

// BORRADO LOGICO
// UPDATE tabla SET nombreColumna = TRUE WHERE campo = ?;

