package com.classicmodels.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String pass = "PracticaRoot";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
	
	
	
	
	
	
	
	}
}
