
public class Ejercicio15 {
	public static void main (String [] args) {
		
		int limite = 10;
		int semilla1 = 0;
		int semilla2 = 1;
		
		System.out.print("Serie de fibonacci con límite " + limite + " numeros y con semillas " + semilla1 + " y " + semilla2 + " es: " );
		
		int almacenarNumero = 0;
		
		System.out.print(semilla1 + ", " + semilla2);
		for (int i = 2; i < limite; i++) {
			almacenarNumero = semilla1 + semilla2;
			System.out.print(". " + almacenarNumero);
			semilla1 = semilla2;
			semilla2 = almacenarNumero;
		}
		System.out.println(".");
	}
}
