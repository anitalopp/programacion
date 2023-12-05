package com.herencia;

public class Animal {
    private String nombre;

    // Constructor de la clase Animal
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido genérico");
    }

    public String getNombre() {
        return nombre;
    }
}
