
public class Ejercicio5 {
	public static void main (String [] args) {
		
		float altura = 190;
		boolean esMujer = false;
		
		if (esMujer) {
			System.out.println("Es mujer");
			if (altura <= 135) {
				System.out.println("La mujer es enana");
			} else if (altura > 135 && altura <= 165) {
				System.out.println("La mujer es de estatura media");
			} else if (altura > 165 && altura <= 190) {
				System.out.println("La mujer es alta");
			} else if (altura > 190) {
				System.out.println("La mujer es gigante");
			}
		} else {
			System.out.println("Es hombre");
		}
			if (altura <= 140) {
				System.out.println("El hombre es enano");
			} else if (altura > 140 && altura <= 165) {
				System.out.println("El hombre es de estatura media");
			} else if (altura > 165 && altura <= 200) {
				System.out.println("El hombre es alto");
			} else if (altura > 200) {
				System.out.println("El hombre es gigante");
		}
		
		
	}
}
