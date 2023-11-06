import java.util.Scanner;

public class MenuPrincipal {
	
	public void muetraMenuPrincipal (){
		
		Integer opcion;
		Scanner sc = new Scanner (System.in);
		do {
		
				System.out.println("********APICACIÓN GESTIÓN DE LIBRERÍA********");
				System.out.println("***************MENÚ PRINCIPAL****************");
				System.out.println("Introduzca, por favor, la opción que quiere realizar ");
				System.out.println("1.Gestión de VENTAS");
				System.out.println("2.Gestión de INVENTARIO");
				System.out.println("3.Gestión de DESCUENTOS");
				System.out.println("4.Salir");

				opcion = sc.nextInt();
				sc.nextLine();
		} while (opcion != 4);
	}
	
	
}
