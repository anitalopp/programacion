package com.ana.taller.interfaces;

import java.util.Scanner;
import com.ana.taller.entidades.Cliente;
import com.ana.taller.entidades.Coche;
import com.ana.taller.entidades.Neumaticos;

public class MenuCambioRuedas {

	public void muestraMenuServicioCambioRuedas() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Dígame la marca de los neumáticos");
		String marca = sc.nextLine();

		System.out.print("Dígame el precio de los neumáticos");
		String anoAntiguedad = sc.nextLine();


	}
}
