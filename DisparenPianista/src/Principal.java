import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Se va a crear una matriz cuadrada");
		System.out.println("Escribe las dimensiones que quieres que tenga");
		int numero = sc.nextInt();
		sc.nextLine();
		
		int[][] matriz = new int[numero][numero];
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				matriz[i][j] = i * numero + j + 1;
			}
		}

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Indique la posición a la que quiere disparar");
		System.out.println("Dime fila");
		sc.nextLine();
		

	}
}
