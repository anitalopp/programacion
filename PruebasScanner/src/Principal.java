import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("por favor, digame el nombre del cliente ");
		
		String nombre = sc.nextLine();
				
		System.out.println("Por favor, dígame la edad del cliente");
		int edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Por favor, dígame la ciudad del cliente ");
		String ciudad = sc.nextLine();

	}
}
