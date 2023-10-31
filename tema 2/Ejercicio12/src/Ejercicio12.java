
public class Ejercicio12 {
    public static void main(String[] args) {
        int base = 2;  
        int exponente = 3; 
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.printf("El resultado de elevar " + base + " a " + exponente + " es " + resultado);
    }
}



