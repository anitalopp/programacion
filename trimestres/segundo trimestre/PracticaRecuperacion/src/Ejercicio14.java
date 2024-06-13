
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String args[]) {
		System.out.println("===EJERCICIO 3===");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una lista de nombre separados por comas");
		String nombresInput = sc.nextLine();	
        String[] nombres = nombresInput.split(",");
        
        int cantidadNombres = nombres.length;
        System.out.println("Has ingresado " + cantidadNombres + " nombres");
        
        String nombreMasLargo = encontrarNombreMasLargo(nombres);
        System.out.println("El nombre más largo es: " + nombreMasLargo);
        
        String nombreMasCorto = encontrarNombreMasCorto(nombres);
        System.out.println("El nombre más corto es: " + nombreMasLargo);
        
        int cuantosVocal = empiezanporVocal(nombres);
        System.out.println(cuantosVocal + "nombre empieza por vocal");
		}

	private static int empiezanporVocal(String[] nombres) {
		int cuenta = 0;
		for (String nombre : nombres) {
            char primeraLetra = nombre.toLowerCase().charAt(0);
            if (primeraLetra == 'a'|| primeraLetra == 'e'|| primeraLetra == 'i'|| primeraLetra == 'o'|| primeraLetra == 'u') {
            	cuenta++;
            }
		}
		return cuenta;
	}

	private static String encontrarNombreMasLargo(String[] nombres) {
		String nombreMasLargo = nombres[0];
		for (String nombre : nombres) {
			if (nombre.length() > nombreMasLargo.length()) {
				nombreMasLargo = nombre;
			}
		}
		return nombreMasLargo;
	}
	
	private static String encontrarNombreMasCorto(String[] nombres) {
		String nombreMasCorto = nombres[0];
		for (String nombre : nombres) {
			if (nombre.length() < nombreMasCorto.length()) {
				nombreMasCorto = nombre;
			}
		}
		return nombreMasCorto;
	}
}
