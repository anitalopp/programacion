package com.ana.hotel.negocio;

import com.ana.hotel.entidades.Cliente;
import com.ana.hotel.entidades.Habitacion;

public class Reserva {

    public  void reservarHabitacion(Cliente cliente, Habitacion habitacion) {
        cliente.setHabitacion(habitacion);
        
        habitacion.setEsOcupada(true);
        
        System.out.println("La reserva de la habitación: " + habitacion.getNumHabitacion() +
                " ha quedado reservada por el cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ".");
    }

    public  void anularReserva(Cliente cliente, Habitacion habitacion) {
        cliente.setHabitacion(null);
        
        habitacion.setEsOcupada(false);
        
        System.out.println("La reserva de la habitación: " + habitacion.getNumPlanta() +
                " ha sido anulada para el cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ".");
    }
}
