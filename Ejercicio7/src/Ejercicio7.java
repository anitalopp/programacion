public class Ejercicio7 {
	public static void main (String [] args) {
	int primerLado = 4;
	int segundoLado = 4;
	int tercerLado = 4; 
	
	if (primerLado == segundoLado && segundoLado == tercerLado) {
		System.out.println("El triángulo es equilátero");
	} else if (primerLado == segundoLado || primerLado == tercerLado || segundoLado == tercerLado) {
		System.out.println("El triángulo es isósceles")	;	
	} else {
		System.out.println("El triángulo es escaleno");
	}
	
}
}
