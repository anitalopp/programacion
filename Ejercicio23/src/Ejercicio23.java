public class Ejercicio23 {
	
	public static void main (String [] args) {
	
		char letra = 'b';
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
		    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("La letra " + letra + " es una vocal");
		}
		else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
			System.out.println("La letra " + letra + " es una consonante");
		}

	}
}
