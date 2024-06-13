package com.cristina.colegio.main;

import java.sql.SQLException;

import com.cristina.colegio.vista.InscripcionVista;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		InscripcionVista iv = new InscripcionVista();
		iv.inscribirEstudiante();
		iv.buscarInscripcionConFiltros();
		iv.actualizarInscripcion();
		iv.borrarEstudiante();

	}

}
