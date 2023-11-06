import java.util.Scanner;

public class Principal {

	public static void main (String [] args) {
//		Cliente cliente1 =  new Cliente ();
//		Cliente cliente2 = new Cliente ();
		
		Cliente cliente1 = new Cliente("kike", 33, "Salamanca");
		Cliente cliente2 = new Cliente ("Juan", 55, "Bilbao");
				
//		Libro l1 = new Libro ();
//		Libro l2 = new Libro ();
//		
		Libro l1 = new Libro("El Quijote", "Miguel de Cervantes", 50.2f);
		Libro l2 = new Libro ("Cien años de soledad", "Gabriel G.Marquez", 20.2f);
		
		cliente1.setEdad(-5);
		
		System.out.println("El cliente número 1 se llama " +cliente1.getNombre() + " y tiene " + cliente1.getEdad()+ " años ");
	
//		Venta venta = new Venta();
//		
//		venta.setCantidad(1);
//		venta.setlibro(l2);
//		venta.setCliente(cliente2);

//Es equivalente a :
		
		Venta venta =  new Venta (cliente1, l1, 1);
		
		venta.registraVenta();
		
//		float valor l2.convertirEurosADolares(4.5f);
		
		UtilidadesCambioMonedas.convertirEurosaDolares(4.5f);
							
		Scanner sc = new Scanner(System.in);
			
		System.out.println("por favor, digame el nombre del cliente ");
			
		String nombre = sc.nextLine();
					
		System.out.println("Por favor, dígame la edad del cliente");
		int edad = sc.nextInt();
		sc.nextLine();
			
		System.out.println("Por favor, dígame la ciudad del cliente ");
		String ciudad = sc.nextLine();
		
		Cliente cliente3 = new Cliente(nombre, edad, ciudad);
						
		

	
	}
}
