package com.ana.finca.menu;

import com.ana.finca.entidades.FincaRectangular;

import java.util.Scanner;

public class MenuFincaRectangular {
    private FincaRectangular fincaRectangular;

    private boolean estaCreadoObjeto() {
        return fincaRectangular != null;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("------ Menú Finca Rectangular ------");
            System.out.println("1. Crear Finca Rectangular");
            System.out.println("2. Mostrar Datos de la Finca");
            System.out.println("3. Calcular Área");
            System.out.println("4. Calcular Perímetro");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    crearFincaRectangular();
                    break;
                case 2:
                    mostrarDatosFinca();
                    break;
                case 3:
                    calcularArea();
                    break;
                case 4:
                    calcularPerimetro();
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private void crearFincaRectangular() {
        System.out.println("Ingrese la longitud de la finca rectangular:");
        Scanner scanner = null;
		double longitud = scanner.nextDouble();

        System.out.println("Ingrese el ancho de la finca rectangular:");
        double ancho = scanner.nextDouble();

        fincaRectangular = new FincaRectangular(longitud, ancho);
        System.out.println("Finca Rectangular creada con éxito.");
    }

    private void mostrarDatosFinca() {
        if (estaCreadoObjeto()) {
            System.out.println("Datos de la Finca Rectangular:");
            System.out.println("Longitud: " + fincaRectangular.getLongitud());
            System.out.println("Ancho: " + fincaRectangular.getAncho());
        } else {
            System.out.println("Primero debe crear una Finca Rectangular.");
        }
    }

    private void calcularArea() {
        if (estaCreadoObjeto()) {
            System.out.println("Área de la Finca Rectangular: " + fincaRectangular.calculaArea());
        } else {
            System.out.println("Primero debe crear una Finca Rectangular.");
        }
    }

    private void calcularPerimetro() {
        if (estaCreadoObjeto()) {
            System.out.println("Perímetro de la Finca Rectangular: " + fincaRectangular.calculaPerimetro());
        } else {
            System.out.println("Primero debe crear una Finca Rectangular.");
        }
    }

    public static void main(String[] args) {
        MenuFincaRectangular menuFincaRectangular = new MenuFincaRectangular();
        menuFincaRectangular.mostrarMenu();
    }
}
