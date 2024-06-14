package com.ana.alumnos.controller;

import java.sql.SQLException;
import java.util.List;

import com.ana.alumnos.dtos.AlumnoDTO;
import com.ana.alumnos.model.ColegioModelo;

public class ColegioController {

	public Integer insertarAlumno(String nombreAlumno, String idMunicipio, int familiaNumerosa)
			throws ClassNotFoundException, SQLException {

		ColegioModelo cm = new ColegioModelo();
		return cm.insertarAlumno(nombreAlumno, idMunicipio, familiaNumerosa);

	}

	public List<AlumnoDTO> buscarAlumnoPorId(String idAlumno, String nombreAlumno, String nombreMunicipio)
			throws ClassNotFoundException, SQLException {

		ColegioModelo cm = new ColegioModelo();

		return cm.buscarAlumnoPorId(idAlumno, nombreAlumno, nombreMunicipio);
	}

	public Integer actualizarAlumno(String id, String nombre, String id_municipio, String familia_numerosa)
			throws ClassNotFoundException, SQLException {

		ColegioModelo cm = new ColegioModelo();
		return cm.actualizarAlumno(id, nombre, id_municipio, familia_numerosa);
	}

	public Integer borrarAlumno(String id) throws ClassNotFoundException, SQLException {

		ColegioModelo cm = new ColegioModelo();
		return cm.borrarAlumno(id);
	}
}