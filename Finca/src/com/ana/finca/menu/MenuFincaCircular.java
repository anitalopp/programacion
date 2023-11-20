package com.ana.finca.menu;

import java.util.Scanner;
import com.ana.finca.entidades.FincaCircular;

public class MenuFincaCircular {
	
	private FincaCircular fincaCircular;

    public MenuFincaCircular() {
    }

    public MenuFincaCircular(FincaCircular fincaCircular) {
        this.fincaCircular = fincaCircular;
    }

    private boolean estaCreadoObjeto() {
        return fincaCircular != null;
    }
	
	public void mostrarMenu() {
			
			int opcion;
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("**********MENU DE GESTION FINCAS CIRCULARES**********");
				System.out.println("1. Crear finca");
				System.out.println("2. Calcular area");
				System.out.println("3. Calcular perimetro");
				System.out.println("4. Salir");
				
				opcion = sc.nextInt();
				sc.nextLine();
				
				switch (opcion) {
				case 1:
					System.out.println("Introduce el radio de la finca circular: ");
                    double radio = sc.nextDouble();
                    
                    fincaCircular = new FincaCircular(radio);
                    System.out.println("Finca creada con éxito.");
                    break;
				case 2:
					if (estaCreadoObjeto()) {
                        System.out.println("El área de la finca es: " + fincaCircular.calculaArea());
                    } else {
                        System.out.println("Primero debe crear la finca.");
                    }
                    break;
				case 3:
					if (estaCreadoObjeto()) {
                        System.out.println("El perímetro de la finca es: " + fincaCircular.calculaPerimetro());
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