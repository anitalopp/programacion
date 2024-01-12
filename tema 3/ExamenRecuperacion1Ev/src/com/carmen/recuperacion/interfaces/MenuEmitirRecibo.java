package com.carmen.recuperacion.interfaces;

import com.carmen.recuperacion.entidades.Curso;
import com.carmen.recuperacion.entidades.Ninho;
import com.carmen.recuperacion.entidades.Progenitor;

public class MenuEmitirRecibo {
	
	public void muestraMenuEmitirRecibo(Progenitor p, Ninho n, Curso c) {
		System.out.println("*****RECIBO DE PAGO EMITIDO A D/Dª: " + p.getNombre());
		System.out.println("Pago por cuso: " + c.getNombre());
		System.out.println("Precio a pagar: " + c.calcularDescuento(n));
	}

}
