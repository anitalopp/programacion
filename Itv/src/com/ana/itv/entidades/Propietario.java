package com.ana.itv.entidades;

// Clase que representa a un Propietario de un vehículo en el sistema ITV.
public class Propietario {

    private String dni;  // DNI del propietario.
    private String nombre;  // Nombre del propietario.
    private String apellido;  // Apellido del propietario.

    // Constructor para la creación de un objeto Propietario.
    public Propietario(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Propietario creado con éxito");  // Imprime un mensaje de éxito en la creación.
        System.out.println();
    }
    
	//Encapsulación:
	//  Restricción del acceso a los detalles internos de un objeto y la protección de sus datos. 
	//  Se declaran las variables como privadas y los métodos públicos para acceder y modificar esos datos.
	//	Métodos de acceso para obtener y establecer el DNI del propietario.
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Métodos de acceso para obtener y establecer el nombre del propietario.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso para obtener y establecer el apellido del propietario.
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
