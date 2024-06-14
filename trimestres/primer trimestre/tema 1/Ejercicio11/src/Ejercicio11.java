
public class Ejercicio11 {
		public static void main (String [] args) {
			
	    float gradosFarenheith= 150f;
		float gradosCentigrados;	
		gradosCentigrados = (Constantes11.PUNTO_EBULLICION * (gradosFarenheith - Constantes11.PUNTO_CONGELACION));
			
		 System.out.println("El resultado de convertir " + gradosCentigrados + " grados Fahrenheit a grados centígrados es: " + gradosFarenheith);
			
			
		}
}
