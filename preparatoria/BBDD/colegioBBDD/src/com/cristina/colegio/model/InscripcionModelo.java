package com.cristina.colegio.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cristina.colegio.dtos.InscripcionDTO;
import com.cristina.colegio.utils.DBUtils;

public class InscripcionModelo {

	public Integer inscribirEstudiante(int estudianteId, int cursoId) throws ClassNotFoundException, SQLException {

		String sql = "INSERT INTO inscripciones (EstudianteID, CursoID )" + " VALUES (?, ?)";

		//Estos pasos siempre son los mismos (salvo en el de filtrar que tenemos que añadir la parte con los %)
		//Creamos una conexión a la BBDD, le pasamos las columnas que queremos con lo de set (cada una con su tipo)
		// Cerramos la conexión y devolvemos el resultado (se lo pasamos al controller)
		Connection con = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = con.prepareStatement(sql);

		ps.setInt(1, estudianteId);
		ps.setInt(2, cursoId);

		resultado = ps.executeUpdate();

		con.close();

		return resultado;
	}
	
	// Esta consulta es la más complicada, probar primero que funciona en mySQL y luego pasarla aquí.
	//Utilizar alias para las tablas (lo de 'as')
	// Para quitarnos líos, en este método todo serán Strings.

	public List<InscripcionDTO> buscarInscripcionConFiltros(String idCurso, String nombreCurso, String idEstudiante,
			String nombreEstudiante) throws ClassNotFoundException, SQLException {

		String sql = "SELECT c.CursoID, c.Nombre_del_Curso as 'nombreCurso', e.EstudianteID, e.Nombre as 'nombreEstudiante' FROM cursos c "
				+ "INNER JOIN inscripciones i ON i.CursoID = c.CursoID "
				+ "INNER JOIN estudiantes e ON e.EstudianteID = i.EstudianteID "
				+ "WHERE c.CursoID LIKE ? OR c.Nombre_del_Curso LIKE ? OR e.EstudianteID LIKE ? OR e.Nombre LIKE ? ";

		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);
		
		// No olvidar poner esto, muy importante. Sirve para filtrar los datos.

		ps.setString(1, "%" + idCurso + "%");
		ps.setString(2, "%" + nombreCurso + "%");
		ps.setString(3, "%" + idEstudiante + "%");
		ps.setString(4, "%" + nombreEstudiante + "%");

		ResultSet inscripcion = ps.executeQuery();
		
		// Con esto creamos una lista de inscripciones y con el while las añadimos una por una.
		
		List<InscripcionDTO> listaInscripcionesFiltradas = new ArrayList<>();

		//MUY IMPORANTE: Lo que va entre comillas aquí son los nombres de las columnas en mysql (o los alias si los hemos puesto.)
		while (inscripcion.next()) {
			InscripcionDTO i = new InscripcionDTO(inscripcion.getString("CursoID"),
					inscripcion.getString("nombreCurso"), inscripcion.getString("EstudianteID"),
					inscripcion.getString("nombreEstudiante"));
			listaInscripcionesFiltradas.add(i);
		}
		
		con.close();
		
		return listaInscripcionesFiltradas;
	}
	
	// Fijarse bien en no dejarse ?, ni when, then, comillas...
	// Dejar un espacio al final del end.
	// Lo del where es la primera variable que hay entre paréntesis del método.
	
	public Integer actualizarInscripcion(String inscripcionId, String estudianteId, String cursoId) throws ClassNotFoundException, SQLException {
	
		String sql = "UPDATE Inscripciones SET EstudianteID = CASE WHEN ? = '' THEN EstudianteID ELSE ? END,"
				+ "CursoID = CASE WHEN ? = '' THEN CursoID ELSE ? END "
				+ "WHERE InscripcionID = ?";
		
		Connection connection = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;
		
		ps = connection.prepareStatement(sql);
		
		ps.setString(1, estudianteId);
		ps.setString(2, estudianteId);
		
		ps.setString(3, cursoId);
		ps.setString(4, cursoId);
		
		ps.setString(5, inscripcionId);
		
		resultado = ps.executeUpdate();

		connection.close();

		return resultado;
	}
	
	
	// Si pide un borrado lógico, hacerlo así. Puede ser que haya que ponerlo a 0 como aquí, o a false.
	// Si pide un borrado físico, hacer "DELETE FROM ... WHERE .... = ?"
	
	public Integer borrarEstudiante(String estudianteId) throws ClassNotFoundException, SQLException {
		
		String sql = "UPDATE estudiantes SET Activo = 0 WHERE EstudianteID = ? LIMIT 1";
				
		Connection connection = DBUtils.conexionBBDD();
	    PreparedStatement ps = null;
	    Integer resultado = null;
	    
	    ps = connection.prepareStatement(sql);
	    
	    ps.setString(1, estudianteId);
	    
	    resultado = ps.executeUpdate();
	    
	    connection.close();
	    
	    return resultado;
	}
	
	// Estos dos métodos son extras pero dan más puntos, son para comprobar si lo que metemos (las IDs en este caso) por consola existe en la BBDD.

	public boolean existeIdEstudiante(Integer estudianteId) throws ClassNotFoundException, SQLException {

		String sql = "SELECT 1 FROM estudiantes WHERE EstudianteID = ? LIMIT 1";

		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, estudianteId);

		ResultSet rs = ps.executeQuery();

		return rs.next();
	}

	public boolean existeIdCurso(Integer cursoId) throws ClassNotFoundException, SQLException {

		String sql = "SELECT 1 FROM cursos WHERE CursoID = ? LIMIT 1";

		Connection con = DBUtils.conexionBBDD();

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, cursoId);

		ResultSet rs = ps.executeQuery();

		return rs.next();
	}
}
