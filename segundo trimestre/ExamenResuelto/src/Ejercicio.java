import java.util.Scanner;

public class Ejercicio {
    
    public static void main (String[] args) {
        System.out.println("====================");
        System.out.println("====Ejercicio 1=====");
        System.out.println("====================");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dígame un número");
        
        int numero = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        String[] array1 = new String[numero];
        
        for (int i = 0; i < numero; i++) {
            System.out.println("Dígame elemento...");
            array1[i] = sc.nextLine();
        }
        
        System.out.println("La palabra es: ");
        int resultado = 0; // Initialize resultado to store the sum
        
        for (int i = 0; i < numero; i++) {
            if (array1[i].charAt(0) >= 'a' && array1[i].charAt(0) <= 'z') {
                System.out.println(array1[i].charAt(0) + " "); // Use 0 instead of i
            } else {
                resultado += Integer.parseInt(array1[i]);
            }
        }
        System.out.println("la suma es: " + resultado);
    }
}

