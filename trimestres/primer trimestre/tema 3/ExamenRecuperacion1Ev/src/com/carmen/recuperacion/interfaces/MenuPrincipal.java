package com.carmen.recuperacion.interfaces;

import java.util.Scanner;

import com.carmen.recuperacion.entidades.Curso;
import com.carmen.recuperacion.entidades.Ninho;
import com.carmen.recuperacion.entidades.Progenitor;

public class MenuPrincipal {
	
	private Progenitor progenitor;
	private Ninho ninho;
	private Curso curso;
	
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		do {
			System.out.println("*****LUDOTECA AYUNTAMIENTO DE SALAMANCA*****");
			System.out.println("Teclee la opcion a realizar: ");
			System.out.println("1. Dar de alta a un progenitor");
			System.out.println("2. Dar de alta a un niño");
			System.out.println("3. Apuntar al niño a un curso");
			System.out.println("4. Emitir recibo");
			System.out.println("5. Salir");
			
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
			case 1:
				MenuAltaProgenitor menuAltaProgenitor = new MenuAltaProgenitor();
				progenitor = menuAltaProgenitor.muestraMenuAltaProgenitor();
				break;
			case 2:
				if(hayProgenitorCreado()) {
					MenuAltaNinho menuAltaNinho = new MenuAltaNinho();
					ninho = menuAltaNinho.muestraMenuAltaNinho();
					progenitor.setNinho(ninho);
					System.out.println("Niño: " + ninho.getNombre() + " asignado a Progenitor: " + progenitor.getNombre());
				} else {
					System.out.println("ATENCION!! Debe de dar antes de alta a un progenitor...");
				}
				break;
			case 3:
				if(hayNinhoCreado()) {
					MenuAltaCurso menuAltaCurso = new MenuAltaCurso();
					curso = menuAltaCurso.muestraMenuAltaCurso();
					ninho.setCurso(curso);
					System.out.println("El niño: " + ninho.getNombre() + " ha sido dado de alta en el cuso: " + curso.getNombre());
				} else {
					System.out.println("Primero debe de dar de alta a un niño");
				}
				break;
			case 4:
				MenuEmitirRecibo menuEmitirRecibo = new MenuEmitirRecibo();
				menuEmitirRecibo.muestraMenuEmitirRecibo(progenitor, ninho, curso);
				break;
			case 5:
				System.out.println("Saliendo de la aplicacion...");
				return;
			
			}
		}while (opcion != 5);
	}
	
	private boolean hayProgenitorCreado() {
        return progenitor != null;
    }

    private boolean hayNinhoCreado() {
        return ninho != null;
    }
	
}
