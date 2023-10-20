
public class Ejercicio6 {
	public static void main (String [] args) {
		
		char letra = 'N';
		int numero = letra;
		
		System.out.println(numero);
		if (numero >= 65 && numero <= 90) {
			System.out.println("La letra es mayúscula");} 
		else if (numero >= 97 && numero <= 122){
			System.out.println("La letra es minúscula");} 
		else {
			System.out.println("No es una letra");
		}
	}
}
