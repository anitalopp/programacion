package com.treeset.main;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator; 

import com.treeset.persona.Persona;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Persona> personas = new TreeSet<>();

        boolean masPersonas = true;

        while (masPersonas) {
            System.out.println("Introduce el nombre de la persona:");
            String nombre = scanner.nextLine();

            System.out.println("Introduce la edad de la persona:");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            personas.add(new Persona(nombre, edad));

            System.out.println("Personas ordenadas por edad: ");
            for (Persona p : personas) {
            	System.out.println(p);
            }
            
            System.out.println("¿Quieres introducir más personas? (si/no)");
            String respuesta = scanner.nextLine().toLowerCase();
            masPersonas = respuesta.equals("si");
        }
     
    }
}
