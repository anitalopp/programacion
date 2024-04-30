package com.spotify.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.spotify.comparator.ComparaArtista;
import com.spotify.comparator.ComparaTitulo;
import com.spotify.tipos.Cancion;

public class Spotify {

	// Declaro este objeto aquí para que tenga visibilidad por todas los métodos

	List<Cancion> listaCanciones = new ArrayList<>();

	public static void main(String[] args) {

		Spotify s = new Spotify();
		s.dale();
		
		// Añadimos HashSet al programa
		HashSet<Cancion> cancionSet = new HashSet<Cancion>(s.listaCanciones);

		// Otra opción:
		// HashSet<Cancion> cancionSet = new HashSet<Cancion>();
		// cancionSet.addAll(s.listaCanciones);
		System.out.println("***********************");
		System.out.println("Contenido del HashSet: ");
		System.out.println("***********************");
		for (Cancion c : cancionSet) {
			System.out.println(c.toString());
		}
		System.out.println("Podemos ver que HashSet elimina duplicados, pero no nos ordena la lista");
		System.out.println("Para ello tenemos que usar TreeSet");

	}

	public void dale() {
		getSongs();

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cómo desea ordenar la lista de canciones? (artista/titulo)" + '\n');
		String ordenacion = sc.next();
		if (ordenacion.equals("artista")) {
			Collections.sort(listaCanciones, new ComparaArtista());

		} else if (ordenacion.equals("titulo")) {
			Collections.sort(listaCanciones, new ComparaTitulo());
		}
		System.out.println("Lista de canciones ordenada por: " + ordenacion);
		System.out.println(("***********************************************"));

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
