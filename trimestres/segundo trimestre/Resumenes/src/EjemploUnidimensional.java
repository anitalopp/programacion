
public class EjemploUnidimensional {

	public static void main(String[] args) {
		// Declaración y creación de un array de enteros
		int[] numeros = new int[5];

		// Asignación de valores a los elementos del array
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;

		// Acceso a los elementos del array y mostrarlos en consola
		System.out.println("Elementos del array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}

		// Longitud del array
		System.out.println("Longitud del array: " + numeros.length);

		// Inicialización de un array de cadenas
		String[] nombres = { "Juan", "María", "Carlos", "Laura", "Pedro" };

		// Recorrido del array de cadenas y mostrar los nombres en consola
		System.out.println("\nNombres:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
}
