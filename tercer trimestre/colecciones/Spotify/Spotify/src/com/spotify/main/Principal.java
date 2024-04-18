package com.spotify.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.spotify.dtos.CancionDTO;

public class Principal {

	public static void main(String[] args) throws IOException {

		List<CancionDTO> listaCanciones = new ArrayList<>();

		File fichero = new File("C:\\Users\\alumnofp\\Documents\\listaCanciones.txt");

		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		while ((linea = br.readLine()) != null) {
			String[] array = linea.split("-");
			// separar los datos con guiones
			CancionDTO cancion = new CancionDTO(array[0], array[1], array[2]);
			listaCanciones.add(cancion);
		}

		System.out.println("Lista canciones sin ordenar:");
		System.out.println("=============================");

		for (CancionDTO cancion : listaCanciones) {
			System.out.println(cancion);
		}

		Collections.sort(listaCanciones);

		System.out.println("Lista canciones ordenada:");
		System.out.println("=============================");

		for (CancionDTO cancion : listaCanciones) {
			System.out.println(cancion);
		}
	}

}
