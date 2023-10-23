
public class Ejercicio18 {
	public static void main (String [] args) {
		
		int rangoInferior = 5;
		int rangoSuperior = 50;
		
		if (rangoSuperior <= rangoInferior) {
			System.out.println("El programa no puede funcionar");
			return;
		} 
		System.out.print("Números primos en el rango de " + rangoInferior + " a " + rangoSuperior + ":");
		for (int num = rangoInferior; num <= rangoSuperior; num++) {
			boolean esPrimo = true;
				if (num <= 1) {
					esPrimo = false;
				} else {
					for (int i = 2; i < num; i++) {
						if (num % i == 0) {
							esPrimo = false;
							break;
						}
					}
			    }
				if (esPrimo) {
					System.out.print(num + " ");
				
				}
		}
	
	}
}
