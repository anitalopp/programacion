package com.ana.alumnos.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ana.alumnos.dtos.AlumnoDTO;
import com.ana.alumnos.utils.DBUtils;

public class ColegioModelo {

	public Integer insertarAlumno(String nombreAlumno, String idMunicipio, int familiaNumerosa)
			throws ClassNotFoundException, SQLException {

		String sql = "INSERT INTO alumnos (nombre, id_municipio, familia_numerosa)" + " VALUES (?, ?, ?)";

		Connection con = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = con.prepareStatement(sql);

		ps.setString(1, nombreAlumno);
		ps.setString(2, idMunicipio);
		ps.setInt(3, familiaNumerosa);

		resultado = ps.executeUpdate();

		con.close();

		return resultado;
	}

	public List<AlumnoDTO> buscarAlumnoPorId(String id, String nombre, String nombre_Municipio)
			throws ClassNotFoundException, SQLException {

		String sql = "SELECT a.id as 'idAlumno', a.nombre as 'nombreAlumno', m.nombre as 'nombreMunicipio' FROM alumnos a "
				+ "inner join municipios m on m.nombre = a.nombreMunicipios"
				+ "WHERE p.pedidoID like ? OR p.ClienteID like ? OR c.Nombre like ? OR pr.ProductoID like ? OR pr.Nombre like ? ";

		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, "%" + id + "%");
		ps.setString(2, "%" + nombre + "%");
		ps.setString(3, "%" + nombre_Municipio + "%");

		ResultSet alumnos = ps.executeQuery();

		List<AlumnoDTO> listaAlumnos = new ArrayList<>();

		while (alumnos.next()) {
			AlumnoDTO a = new AlumnoDTO(alumnos.getString("AlumnoID"), 0, alumnos.getString("Nombre"),
					alumnos.getString("Población"), null);
			listaAlumnos.add(a);
		}

		con.close();

		return listaAlumnos;
	}

	public Integer actualizarAlumno(String id, String nombre, String id_municipio, String familia_numerosa)
			throws ClassNotFoundException, SQLException {

		String sql = "UPDATE alumnos SET id = CASE WHEN ? = '' THEN id ELSE ? END,"
				+ "nombre = CASE WHEN ? = '' THEN nombre ELSE ? END, "
				+ "id_municipio = CASE WHEN ? = '' THEN id_municipio ELSE ? END, " + "familia_numerosa = CASE WHEN ? = '' THEN familia_numerosa ELSE ? END "
				+ "WHERE id = ?";

		Connection connection = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = connection.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, id);

		ps.setString(3, nombre);
		ps.setString(4, nombre);
		
		ps.setString(5, id_municipio);
		ps.setString(6, id_municipio);

		ps.setString(7, familia_numerosa);
		ps.setString(8, familia_numerosa);

		resultado = ps.executeUpdate();

		connection.close();

		return resultado;

	}

	public Integer borrarAlumno(String id) throws ClassNotFoundException, SQLException {

		String sql = "DELETE FROM alumnos WHERE id = ?";

		Connection connection = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = connection.prepareStatement(sql);
		ps.setString(1, id);

		resultado = ps.executeUpdate();

		connection.close();

		return resultado;
	}
	

}