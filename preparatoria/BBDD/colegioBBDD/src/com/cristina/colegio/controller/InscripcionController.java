package com.cristina.colegio.controller;

import java.sql.SQLException;
import java.util.List;

import com.cristina.colegio.dtos.InscripcionDTO;
import com.cristina.colegio.model.InscripcionModelo;

public class InscripcionController {
	
	// Esta clase es como un puente entre el modelo y la vista, simplemente recibimos cada
	// uno de los métodos que vienen del modelo y se los devolvemos (return) a la vista.

	public Integer inscribirEstudiante(int estudianteId, int cursoId) throws ClassNotFoundException, SQLException {

		InscripcionModelo im = new InscripcionModelo();
		return im.inscribirEstudiante(estudianteId, cursoId);
	}

	public List<InscripcionDTO> buscarInscripcionConFiltros(String idCurso, String nombreCurso, String idEstudiante,
			String nombreEstudiante) throws ClassNotFoundException, SQLException {

		InscripcionModelo im = new InscripcionModelo();
		return im.buscarInscripcionConFiltros(idCurso, nombreCurso, idEstudiante, nombreEstudiante);
	}
	
	public Integer actualizarInscripcion(String inscripcionId, String estudianteId, String cursoId) throws ClassNotFoundException, SQLException {
		
		InscripcionModelo im = new InscripcionModelo();
		return im.actualizarInscripcion(inscripcionId, estudianteId, cursoId);
	}

	public Integer borrarEstudiante(String estudianteId) throws ClassNotFoundException, SQLException {
		
		InscripcionModelo im = new InscripcionModelo();
		return im.borrarEstudiante(estudianteId);
	}

	
	// IMPORTANTE: poner static en estos dos métodos, si no no los podremos usar en la vista

	public static boolean existeIdEstudiante(Integer estudianteId) throws ClassNotFoundException, SQLException {

		InscripcionModelo im = new InscripcionModelo();
		return im.existeIdEstudiante(estudianteId);
	}

	public static boolean existeIdCurso(Integer cursoId) throws ClassNotFoundException, SQLException {

		InscripcionModelo im = new InscripcionModelo();
		return im.existeIdCurso(cursoId);

	}

}
