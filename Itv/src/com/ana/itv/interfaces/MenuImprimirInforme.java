
package com.ana.itv.interfaces;

import com.ana.itv.*;
import com.ana.itv.entidades.Propietario;
import com.ana.itv.entidades.Vehiculo;

public class MenuImprimirInforme {

	public void emiteInforme(Vehiculo vehiculo, Propietario propietario) {
		System.out.println("** INFORME ITV **");
		System.out.println("Propietario: " + propietario.getNombre() + " " + propietario.getApellido());
		System.out.println("DNI: " + propietario.getDni());
		System.out.println("Matrícula del vehículo: " + vehiculo.getMatricula());

		imprimeDeficienciasGraves(vehiculo);
		imprimeDeficienciasLeves(vehiculo);

		if (vehiculo.isRevisionSuperada()) {
			System.out.println("ITV SUPERADA");
		} else {
			System.out.println("ITV NO SUPERADA");
		}
	}

	private void imprimeDeficienciasGraves(Vehiculo vehiculo) {
		if (vehiculo.getDeficienciasGraves() == null || vehiculo.getDeficienciasGraves().isEmpty()) {
			System.out.println("No hay deficiencias graves.");
		} else {
			System.out.println("ITV NO SUPERADA.");
			System.out.println("DEFICIENCIAS GRAVES: " + vehiculo.getDeficienciasGraves());
		}
	}

	private void imprimeDeficienciasLeves(Vehiculo vehiculo) {
		if (vehiculo.getDeficienciasLeves() == null || vehiculo.getDeficienciasLeves().isEmpty()) {
			System.out.println("No hay deficiencias leves.");
		} else {
			System.out.println("DEFICIENCIAS LEVES: " + vehiculo.getDeficienciasLeves());
		}
	}

}