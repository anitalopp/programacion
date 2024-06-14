import java.util.Random;
import java.util.Scanner;

public class DisparenPianista {

 	public static void main (String args[]) {
		
        Scanner sc = new Scanner(System.in);
 		System.out.println("Ingrese un número");
 		int tamano = sc.nextInt();
		sc.nextLine();

 		String[][] array= new String[tamano][tamano];
 		
 		Random random = new Random();
 		
 		
 		 for (int i = 0; i < tamano; i++) {
             for (int j = 0; j < tamano; j++) {
                 int numeroAleatorio = random.nextInt(tamano);
                 array[i][j] = Integer.toString(numeroAleatorio);
             }
         }
 		
 	
 		for (int i = 0; i < tamano; i++) {
 			for (int j = 0; j < tamano; j++) {
 				System.out.print("|" + array[i][j] + "|" + "  ");
 			}
 			System.out.println();
 		}
 		
 		System.out.println("Indica la fila a la que quieres disparar");
 		int fila = sc.nextInt();
 		sc.nextLine();
 		System.out.println("Indica la columna a la que quieres disparar");
 		int columna = sc.nextInt();
 		sc.nextInt();
 		
 		
 	
 	
 	}
}


