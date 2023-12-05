package com.herencia;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la subclase Perro
        Perro miPerro = new Perro("Buddy", "Labrador");

        // Acceder a los métodos de la superclase Animal
        System.out.println("Nombre del animal: " + miPerro.getNombre());
        miPerro.emitirSonido(); // Llama al método sobrescrito en la subclase

        // Acceder a los métodos de la subclase Perro
        System.out.println("Raza del perro: " + miPerro.getRaza());
        miPerro.ladrar();
    }
}
