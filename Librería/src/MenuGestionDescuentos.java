import java.util.Scanner;

public class MenuGestionDescuentos {

	public void muestraMenu() {

		int opcion;
		Scanner sc = new Scanner(System.in);

		System.out.println("*****Submenú de cálculo de descuentos*****");
		System.out.println("********Teclee la opción que desee********");
		System.out.println("1.Calcular descuento");
		System.out.println("2.Salir");

		opcion = Integer.parseInt(sc.nextLine());

		switch (opcion) {
		case 1:
			Libro libro = UtilidadesCreacionDeObjetos.crearLibro(sc);
			Cliente cliente = UtilidadesCreacionDeObjetos.crearCliente(sc);

			float descuento = libro.calculaDescuento(cliente);

			System.out.println("El descuento para el cliente " + cliente.getNombre() + " y el libro "
					+ libro.getTitulo() + " es " + libro.getTitulo() + " es " + descuento);
			break;
		case 2:
			return;
		default:
			System.out.println("Opción incorrecta: Debe teclear un número comprendido entre 1 y 2");
		}

	}
}
