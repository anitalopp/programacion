
public class Ejercicio24 {

    public static void main(String[] args) {

        char letra = 'a'; 
        
        if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
            System.out.println("El caracter " + letra + " está en el alfabeto");
        } else {
            System.out.println("El caracter " + letra + " no está en el alfabeto");
        }
    }
}
