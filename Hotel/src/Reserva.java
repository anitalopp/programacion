public class Reserva {

    public static void reservarHabitacion(Cliente cliente, Habitacion habitacion) {
        cliente.setHabitacion(habitacion);
        
        habitacion.setEsOcupada(true);
        
        System.out.println("La reserva de la habitación: " + habitacion.getNumHabitacion() +
                " ha quedado reservada por el cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ".");
    }

    public static void anularReserva(Cliente cliente, Habitacion habitacion) {
        cliente.setHabitacion(null);
        
        habitacion.setEsOcupada(false);
        
        System.out.println("La reserva de la habitación: " + habitacion.getNumPlanta() +
                " ha sido anulada para el cliente: " + cliente.getNombre() + " " + cliente.getApellido() + ".");
    }
}
