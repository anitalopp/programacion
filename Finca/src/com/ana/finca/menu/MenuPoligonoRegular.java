package com.ana.finca.menu;

import java.util.Scanner;
import com.ana.finca.entidades.FincaPoligonoRegular;

public class MenuPoligonoRegular {
	
	private FincaPoligonoRegular fincaPoligonoRegular;
	
    public MenuPoligonoRegular() {
    }

    public MenuPoligonoRegular(FincaPoligonoRegular fincaPoligonoRegular) {
        this.fincaPoligonoRegular = fincaPoligonoRegular;
    }
    
    private boolean estaCreadoObjeto() {
        return fincaPoligonoRegular != null;
    }
	
	public void mostrarMenu() {
			
			int opcion;
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("**********MENU DE GESTION FINCAS POLIGONO REGULAR**********");
				System.out.println("1. Crear finca");
				System.out.println("2. Calcular area");
				System.out.println("3. Calcular perimetro");
				System.out.println("4. Salir");
				
				opcion = sc.nextInt();
				sc.nextLine();
				
				switch (opcion) {
				case 1:
					System.out.println("Introduce el apotema del polígono regular: ");
                    double apotema = sc.nextDouble();
                    System.out.println("Introduce el lado del polígono regular: ");
                    double lado = sc.nextDouble();
                    System.out.println("Introduce el número de lados del polígono regular: ");
                    int numeroLados = sc.nextInt();
                    
                    fincaPoligonoRegular = new FincaPoligonoRegular();
                    System.out.println("Finca creada con éxito.");
                    break;
				case 2:
					if (estaCreadoObjeto()) {
                        System.out.println("El área de la finca es: " + fincaPoligonoRegular.calculaArea());
                    } else {
                        System.out.println("Primero debe crear la finca.");
                    }
                    break;
				case 3:
					if (estaCreadoObjeto()) {
                        System.out.println("El perímetro de la finca es: " + fincaPoligonoRegular.calculaPerimetro());
                    } else {
                        System.out.println("Primero debe crear la finca.");
                    }
                    break;
				case 4:
					return;
				default: 
					System.out.println("Debe elegir una opcion entre 1 y 4");
				}
				
			}while (opcion != 4);
			
			
	}


}
