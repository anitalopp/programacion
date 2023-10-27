
public class Ejercicio7 {
	public static void main (String [] args) {
		
		int primerLado = 20;
		int segundoLado = 30;
		int tercerLado = 40;
		
		if (primerLado == segundoLado && segundoLado == tercerLado) {
			System.out.println("El triángulo es equilátero");}
		else if (primerLado == segundoLado || primerLado == tercerLado || segundoLado == tercerLado) {
			System.out.println("EL triánfulo es isósceles"); }
		else {
			System.out.println("El triángulo es escaleno"); }		
				
	}
}

