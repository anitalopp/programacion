package com.ana.alumnos.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	public static Connection conexionBBDD() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		String servidor = "jdbc:mysql://localhost:3306/colegiodb";
		String username = "root"; 
		String password = "PracticaRoot"; 
		Connection conexionBD = DriverManager.getConnection(servidor, username, password);
		return conexionBD;
	}
}
