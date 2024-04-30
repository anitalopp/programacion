package com.ayuntamiento.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import com.ayuntamiento.tipos.Coche;

public class Principal {

	HashSet<Coche> conjuntoCoches = new HashSet<>();

	public static void main(String args[]) {

		Principal p = new Principal();

		p.leeCoches();

		System.out.println(p.conjuntoCoches);

	}

	public void leeCoches() {
		File file = new File("C:\\Users\\alumnofp\\eclipse-workspace\\tercer-trimestre\\colecciones\\ficheros\\listaCochesSalamanca.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {
				anadeCoches(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void anadeCoches(String linea) {
		String[] arrayDePropietarios = linea.split(";");
		Coche c = new Coche(arrayDePropietarios[0].trim(), arrayDePropietarios[1].trim());
		conjuntoCoches.add(c);
	}

}
