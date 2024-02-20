package JavaFaker;

import com.github.javafaker.Faker;
import java.util.Scanner;

public class Principal {
    
    public static void main (String[] args) {
        Faker faker = new Faker ();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba el tamaño del array que almacenará las palabras/frases");
        int numero = sc.nextInt();
        sc.nextLine();
        String javafaker[] = new String[numero];
        
        System.out.println("Introduzca la temática para rellenar el array");
        System.out.println("1.Personajes de Juego de Tronos");
        System.out.println("2.Nombres graciosos");
        System.out.println("3.Nombres de superhéroes");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion) {
            case 1: 
                for (int i = 0; i < numero; i++) {
                    javafaker[i] = faker.gameOfThrones().character();
                    System.out.println(javafaker[i]);
                }
                break;
            case 2:
            	for (int i = 0; i < numero; i++) {
            		javafaker[i] = faker.funnyName().name();
            		System.out.println(javafaker[i]);
            	}
            	break;
            case 3:
            	for (int i = 0; i < numero; i++) {
            		javafaker[i] = faker.superhero().name();
            		System.out.println(javafaker[i]);
            	}
            	break;
            default:
            	System.out.println("Temática no válida. Se generará el array con números");
        } 
        
        System.out.println("\nArray generado");
        for (String element : javafaker) {
        	System.out.println(element);
        }
        
        System.out.println("\nDígame la palabra que quiere encontrar en el array");
        String palabra = sc.nextLine();
        
        boolean encontrado = false;
        for (String element : javafaker) {
        	if (element.equalsIgnoreCase(palabra)) {
        		encontrado = true;
        		break;
        	}
        }
        
        if (encontrado) {
        	System.out.println("La palabra \"" + palabra + "\" ha sido encontrada en el array.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no ha sido encontrada en el array.");
        }
    }
}
