package com.hashset.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import com.hashet.dto.Texto;

public class Main {

	public static void main (String args[]) throws IOException {
		
		FileReader frTexto = new FileReader("C:\\Users\\alumnofp\\Desktop\\02.txt");
		BufferedReader brTexto = new BufferedReader(frTexto);
		
		HashSet<Texto> textoSet = new HashSet<Texto>();
		String linea;
		while ((linea = brTexto.readLine()) != null) {
			arrayPalabras(linea);
			
			
			
			
		}
		
		
		brTexto.close();
		
		
	}

	private static void arrayPalabras(String linea) {

		String[] arrayPalabras = linea.split(";"  )
		
	}
}
