package com.ana.itv.interfaces;

import com.ana.itv.entidades.Vehiculo;

import java.util.Scanner;

public class MenuCreacionVehiculo {

    public Vehiculo muestraMenuCreacionVehiculo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("*MENÚ CREACIÓN DE VEHÍCULO*");

        System.out.print("Por favor, introduzca la matrícula: ");
        String matricula = sc.nextLine();

        while (matricula.trim().isEmpty()) {
            System.out.println("ERROR, la matrícula no puede estar vacía");
            matricula = sc.nextLine();
        }

        System.out.print("Por favor, introduzca el modelo del vehículo: ");
        String modelo = sc.nextLine();

        while (modelo.trim().isEmpty()) {
            System.out.println("ERROR, el modelo no puede estar vacío");
            modelo = sc.nextLine();
        }

        int caballos = 0;
        while (caballos <= 0) {
            System.out.print("Por favor, introduzca los caballos del vehículo: ");

            while (!sc.hasNextInt()) {
                System.out.println("ERROR: los caballos deben ser un número mayor que 0");
                sc.next(); 
            }

            caballos = sc.nextInt();

            if (caballos <= 0) {
                System.out.println("ERROR: los caballos deben ser mayores que 0");
            }
        }

        sc.nextLine(); 

        String combustible = "";
        while (!combustible.equals("diesel") && !combustible.equals("gasolina")) {
            System.out.print("Por favor, introduzca el combustible del vehículo (diesel o gasolina): ");
            combustible = sc.nextLine().trim().toLowerCase();
            if (!combustible.equals("diesel") && !combustible.equals("gasolina")) {
                System.out.println("Debe introducir Diesel o Gasolina");
            }
        }

        Vehiculo vehiculo = new Vehiculo(matricula, modelo, Integer.toString(caballos), combustible);
        return vehiculo;
    }
}

