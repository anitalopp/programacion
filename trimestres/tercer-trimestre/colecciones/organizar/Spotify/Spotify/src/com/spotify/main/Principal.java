package com.spotify.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.spotify.dtos.CancionDTO;
import com.spotify.dtos.ComparadorArtista;
import com.spotify.dtos.ComparadorTitulo;

public class Principal {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		List<CancionDTO> listaCanciones = new ArrayList<>();

		creaListaCanciones(listaCanciones);
		
		System.out.println("Lista canciones sin ordenar:");
		System.out.println("=============================");

		imprimeCanciones(listaCanciones);

		System.out.println("¿Por qué criterio desea ordenar las canciones? (artista/título/usuario)");
		String respuesta = sc.nextLine();
		
		if(respuesta.equalsIgnoreCase("artista")) {
			Collections.sort(listaCanciones, new ComparadorArtista());
		} else if(respuesta.equalsIgnoreCase("titulo")) {
			Collections.sort(listaCanciones, new ComparadorTitulo());
		} else if(respuesta.equalsIgnoreCase("usuario")) {
			Collections.sort(listaCanciones);
		}
		
		

		System.out.println("Lista canciones ordenada:");
		System.out.println("=============================");
		imprimeCanciones(listaCanciones);
		
	}

	private static void imprimeCanciones(List<CancionDTO> listaCanciones) {
		

		for (CancionDTO cancion : listaCanciones) {
			System.out.println(cancion);
		}
	}

	private static void creaListaCanciones(List<CancionDTO> listaCanciones) throws FileNotFoundException, IOException {
		File fichero = new File("C:\\Users\\alumnofp\\Documents\\listaCanciones.txt");

		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		while ((linea = br.readLine()) != null) {
			String[] array = linea.split("-");
			// separar los datos con guiones
			CancionDTO cancion = new CancionDTO(array[0], array[1], array[2]);
			listaCanciones.add(cancion);
		}
	}

}
