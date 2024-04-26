package com.censo.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.censo.dtos.CocheDTO;
import com.spotify.dtos.CancionDTO;

public class Principal {

	List<CocheDTO> listaCoches = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		CocheDTO coche = new CocheDTO();

	}

	public void orden() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cómo desea ordenar la lista? nombre, marca, modelo");
		String ordenacion = sc.next();

		if (ordenacion.equals("marca")) {
			Collections.sort(listaCoches, new ComparaMarca());
		} else if (ordenacion.equals("modelo")) {
			Collections.sort(listaCoches, new ComparaModelo());
		}

		System.out.println("Lista de coches ordenada por: " + ordenacion);
		System.out.println("***********************************************");

		for (CocheDTO c : listaCoches) {
			System.out.println(c.toString());
		}
	}

	private static void creaListaCanciones(List<CocheDTO> listaCoches) throws FileNotFoundException, IOException {
		File fichero = new File(
				"C:\\Users\\alumnofp\\eclipse-workspace\\tercer trimestre\\colecciones\\ficheros\\listaCochesSalamanca.txt");

		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		while ((linea = br.readLine()) != null) {
			String[] array = linea.split("-");
			// separar los datos con guiones
			CocheDTO cancion = new CocheDTO(array[0], array[1]);
			listaCoches.add(cancion);
		}
	}

	private static void imprimeCanciones(List<CocheDTO> listaCanciones) {

		try {
			for (CocheDTO cancion : listaCoches) {
				System.out.println(cancion);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
