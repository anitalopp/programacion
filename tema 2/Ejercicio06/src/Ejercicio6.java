
public class Ejercicio6 {
	public static void main (String[] args) {
		
		char letra = 'N';
	
		if (letra >= 'A' && letra <= 'Z') {
			System.out.println("La letra " + letra + " es mayúscula");
		} else if (letra >= 'a' && letra <= 'z') {
			System.out.println("La letra es minúscula");
		} else {
			System.out.println("No es una letra");
		}
	}
}
