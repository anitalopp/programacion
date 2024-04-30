package com.nominas.main;

import com.nominas.entidades.Administrativo;
import com.nominas.entidades.Freelance;
import com.nominas.entidades.Programador;
import com.nominas.entidades.Trabajador;

public class Main {

	public static void main(String args[]) {
		pagaNominas(extraeTrabajadoresDeLaBaseDeDatos());
	}

	public static Trabajador[] extraeTrabajadoresDeLaBaseDeDatos() {

		Trabajador[] arrayTrabajadores = new Trabajador[4];

		Trabajador t1 = new Administrativo(1, "pepe", 2000.0, 300.0);
		Trabajador t2 = new Programador(2, "kike", 2000.2, 300.0);
		Trabajador t3 = new Programador(3, "susana", 2000.0, 300.0);
		Trabajador t4 = new Freelance(4, "martin", 1.2, 300.0, 60.0, 900.0);

		arrayTrabajadores[0] = t1;
		arrayTrabajadores[1] = t2;
		arrayTrabajadores[2] = t3;
		arrayTrabajadores[3] = t4;

		return arrayTrabajadores;
	}

	public static void pagaNominas(Trabajador[] listaTrabajadores) {
		for (Trabajador t : listaTrabajadores) {
			System.out.println("Calculando salario de " + t.getNombre() + " " + t.calcularSalario());
		}

	}
	
	

}
