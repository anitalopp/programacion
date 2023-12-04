public class Perro extends Animal {
    private String raza;

    // Constructor de la subclase Perro
    public Perro(String nombre, String raza) {
        // Llamada al constructor de la superclase con super()
        super(nombre);
        this.raza = raza;
    }

    // Método específico de la subclase Perro
    public void ladrar() {
        System.out.println("Guau, guau!");
    }

    // Sobrescritura del método de la superclase Animal
    @Override
    public void emitirSonido() {
        System.out.println("Guau, guau (sonido de un perro)");
    }

    // Método de la subclase Perro
    public String getRaza() {
        return raza;
    }
}
