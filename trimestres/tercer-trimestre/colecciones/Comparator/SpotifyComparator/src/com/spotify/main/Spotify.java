package com.spotify.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.spotify.comparator.ComparaArtista;
import com.spotify.comparator.ComparaTitulo;
import com.spotify.tipos.Cancion;

public class Spotify {

	// Declaro este objeto aquí para que tenga visibilidad por todas los métodos

	List<Cancion> listaCanciones = new ArrayList<>();

	public static void main(String[] args) {

		new Spotify().dale();

	}

	public void dale() {
		getSongs();

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cómo desea ordenar la lista de canciones? (artista/titulo)" + '\n');
		String ordenacion = sc.next();
		sc.close();
		if (ordenacion.equals("artista")) {
			Collections.sort(listaCanciones, new ComparaArtista());

		} else if (ordenacion.equals("titulo")) {
			Collections.sort(listaCanciones, new ComparaTitulo());
		}

		for (Cancion c : listaCanciones) {
			System.out.println(c.toString());
		}
	}

	/**
	 * Leer el fichero de log e introduce el primer elemento de cada linea (la
	 * canción) en un arayList
	 * 
	 * @throws Exception
	 */
	void getSongs() {

		File file = new File("C://listacanciones.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {

				anadeCancion(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void anadeCancion(String linea) {

		String[] arrayDeCanciones = linea.split("-");
		Cancion c = new Cancion(arrayDeCanciones[0], arrayDeCanciones[1], arrayDeCanciones[2]);
		listaCanciones.add(c);
	}
}
