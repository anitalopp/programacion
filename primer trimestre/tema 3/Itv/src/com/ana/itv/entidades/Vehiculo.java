package com.ana.itv.entidades;

// Clase que representa un Vehículo en el sistema ITV.
public class Vehiculo {

    private String matricula;  // Matrícula del vehículo.
    private String modelo;  // Modelo del vehículo.
    private String caballos;  // Potencia en caballos del vehículo.
    private String combustible;  // Tipo de combustible del vehículo.
    private String deficienciasLeves;  // Deficiencias leves detectadas en la revisión ITV.
    private String deficienciasGraves;  // Deficiencias graves detectadas en la revisión ITV.
    private boolean revisionPasada;  // Indica si la revisión ITV ha sido pasada.
    private boolean revisionSuperada;  // Indica si la revisión ITV ha sido superada.

    // Constructor para la creación de un objeto Vehiculo con información inicial completa.
    public Vehiculo(String matricula, String modelo, String caballos, String combustible,
            String deficienciasLeves, String deficienciasGraves, boolean revisionPasada,
            boolean revisionSuperada) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.caballos = caballos;
        this.combustible = combustible;
        this.deficienciasLeves = deficienciasLeves;
        this.deficienciasGraves = deficienciasGraves;
        this.revisionPasada = revisionPasada;
        this.revisionSuperada = revisionSuperada;
    }
    
//Encapsulación:
//  Restricción del acceso a los detalles internos de un objeto y la protección de sus datos. 
//  Se declaran las variables como privadas y los métodos públicos para acceder y modificar esos datos.
//	Métodos de acceso para obtener y establecer el DNI del propietario.
    
    // Métodos de acceso para obtener y establecer la matrícula del vehículo.
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Métodos de acceso para obtener y establecer el modelo del vehículo.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos de acceso para obtener y establecer la potencia en caballos del vehículo.
    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }

    // Métodos de acceso para obtener y establecer el tipo de combustible del vehículo.
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    // Métodos de acceso para obtener y establecer deficiencias leves detectadas en la revisión ITV.
    public String getDeficienciasLeves() {
        return deficienciasLeves;
    }

    public void setDeficienciasLeves(String deficienciasLeves) {
        this.deficienciasLeves = deficienciasLeves;
    }

    // Métodos de acceso para obtener y establecer deficiencias graves detectadas en la revisión ITV.
    public String getDeficienciasGraves() {
        return deficienciasGraves;
    }

    public void setDeficienciasGraves(String deficienciasGraves) {
        this.deficienciasGraves = deficienciasGraves;
    }

    // Métodos de acceso para obtener y establecer si la revisión ITV ha sido pasada.
    public boolean isRevisionPasada() {
        return revisionPasada;
    }

    public void setRevisionPasada(boolean revisionPasada) {
        this.revisionPasada = revisionPasada;
    }

    // Métodos de acceso para obtener y establecer si la revisión ITV ha sido superada.
    public boolean isRevisionSuperada() {
        return revisionSuperada;
    }

    public void setRevisionSuperada(boolean revisionSuperada) {
        this.revisionSuperada = revisionSuperada;
    }

    // Método específico del vehículo (podría ser cualquier operación adicional relacionada con el vehículo).
    public void metodoEspecifico() {
        // Implementación específica del método, si es necesario.
    }

    // Método que calcula el precio de la ITV según las características del vehículo.
    public double calculaPrecioITV() {
        double precioBase = 0.0;

        int caballos = Integer.parseInt(this.caballos);

        // Lógica para calcular el precio base de la ITV según el tipo de combustible y la potencia en caballos.
        // Se aplican distintas tarifas según las condiciones especificadas.
        if (combustible.equalsIgnoreCase("Gasolina")) {
            if (caballos <= 60) {
                precioBase = 30;
            } else if (caballos <= 120) {
                precioBase = 50;
            } else if (caballos <= 140) {
                precioBase = 55;
            } else {
                precioBase = 100;
            }
        } else if (combustible.equalsIgnoreCase("Diesel")) {
            if (caballos <= 60) {
                precioBase = 30 * 1.3;
            } else if (caballos <= 120) {
                precioBase = 50 * 1.3;
            } else if (caballos <= 140) {
                precioBase = 55 * 1.3;
            } else {
                precioBase = 100 * 1.3;
            }
        }

        return precioBase;
    }

    // Constructor adicional para la creación de un objeto Vehiculo con información inicial básica.
    public Vehiculo(String matricula, String modelo, String caballos, String combustible) {
        super();  // Llama al constructor de la clase base (Object).
        this.matricula = matricula;
        this.modelo = modelo;
        this.caballos = caballos;
        this.combustible = combustible;
        System.out.println("Vehículo creado con éxito");  // Imprime un mensaje de éxito en la creación.
        System.out.println();
    }

    // Método estático que indica si hay algún vehículo creado.
    public static boolean hayVehiculoCreado() {
        return false;  // Actualmente siempre retorna falso, debería ser modificado según la lógica de la aplicación.
    }
}

