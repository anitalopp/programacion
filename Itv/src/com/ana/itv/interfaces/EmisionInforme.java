package com.ana.itv.interfaces;

import com.ana.itv.entidades.Propietario;
import com.ana.itv.entidades.Vehiculo;

public class EmisionInforme {

    public void emiteInforme(Vehiculo vehiculo, Propietario propietario) {
        System.out.println("Informe de la ITV");
        System.out.println("Propietario: " + propietario.getNombre());

        imprimeDeficienciasGraves(vehiculo);
        imprimeDeficienciasLeves(vehiculo);

        System.out.println("Resultado de la ITV:");
        if (!vehiculo.isRevisionSuperada()) {
            System.out.println("ITV NO SUPERADA");
        } else {
            System.out.println("ITV SUPERADA");
        }
    }

    private void imprimeDeficienciasGraves(Vehiculo vehiculo) {
        System.out.println("Deficiencias Graves:");
        if (vehiculo.getDeficienciasGraves() == null || vehiculo.getDeficienciasGraves().isEmpty()) {
            System.out.println("No hay deficiencias graves.");
        } else {
            System.out.println("ITV NO SUPERADA");
            System.out.println("DEFICIENCIAS GRAVES: " + vehiculo.getDeficienciasGraves());
        }
    }

    private void imprimeDeficienciasLeves(Vehiculo vehiculo) {
        System.out.println("Deficiencias Leves:");
        if (vehiculo.getDeficienciasLeves() == null || vehiculo.getDeficienciasLeves().isEmpty()) {
            System.out.println("No hay deficiencias leves.");
        } else {
            System.out.println("DEFICIENCIAS LEVES: " + vehiculo.getDeficienciasLeves());
        }
    }
}
