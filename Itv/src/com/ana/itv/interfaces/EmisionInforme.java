package com.ana.itv.interfaces;

import com.ana.itv.entidades.Propietario;
import com.ana.itv.entidades.Vehiculo;

// Clase que representa la emisión de un informe de la ITV.
public class EmisionInforme {

    // Método que emite un informe de la ITV para un vehículo y propietario dados.
    public void emiteInforme(Vehiculo vehiculo, Propietario propietario) {
        System.out.println("Informe de la ITV");
        System.out.println("Propietario: " + propietario.getNombre());

        // Llama a métodos privados para imprimir deficiencias graves y leves del vehículo.
        imprimeDeficienciasGraves(vehiculo);
        imprimeDeficienciasLeves(vehiculo);

        System.out.println("Resultado de la ITV:");
        if (!vehiculo.isRevisionSuperada()) {
            System.out.println("ITV NO SUPERADA");
        } else {
            System.out.println("ITV SUPERADA");
        }
    }

    // Método privado para imprimir deficiencias graves del vehículo en el informe.
    private void imprimeDeficienciasGraves(Vehiculo vehiculo) {
        System.out.println("Deficiencias Graves:");
        if (vehiculo.getDeficienciasGraves() == null || vehiculo.getDeficienciasGraves().isEmpty()) {
            System.out.println("No hay deficiencias graves.");
        } else {
            System.out.println("ITV NO SUPERADA");
            System.out.println("DEFICIENCIAS GRAVES: " + vehiculo.getDeficienciasGraves());
        }
    }

    // Método privado para imprimir deficiencias leves del vehículo en el informe.
    private void imprimeDeficienciasLeves(Vehiculo vehiculo) {
        System.out.println("Deficiencias Leves:");
        if (vehiculo.getDeficienciasLeves() == null || vehiculo.getDeficienciasLeves().isEmpty()) {
            System.out.println("No hay deficiencias leves.");
        } else {
            System.out.println("DEFICIENCIAS LEVES: " + vehiculo.getDeficienciasLeves());
        }
    }
}

