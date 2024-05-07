package com.practica.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.practica.dto.Palabras;

public class Main {

	public static void main (String args[]) throws IOException {
				
		FileReader frListaPersonas = new FileReader("C:\\Users\\alumnofp\\Desktop\\palabras.txt");
		BufferedReader bfListaPersonas = new BufferedReader(frListaPersonas);
		
		HashSet<Palabras> setPalabras = new HashSet<>();
		
	
		String linea;
		while (((linea = bfListaPersonas.readLine()) != null)) {
			Palabras palabra = new Palabras(linea.trim());
			setPalabras.add(palabra);
		}
		
		for (Palabras palabra : setPalabras) {
			System.out.println(palabra);
			
		}
		
		bfListaPersonas.close();
	}
}
