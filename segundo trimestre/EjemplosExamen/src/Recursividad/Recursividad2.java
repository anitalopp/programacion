package Recursividad;

public class Recursividad2 {

	public static void main(String[] args) {
		Integer numero = 5;
		System.out.println("El factorial de " + numero + " es " + factorialIterativo(numero));

		System.out.println("El factorial de " + numero + " es " + factorialRecursivo(numero));

		Integer base = 2;
		Integer exponente = 3;
		System.out.println("El resultado de elevar " + base + " a " + exponente + " es "
				+ calcularPotenciaDeFormaIterativa(base, exponente));

		System.out.println("El resultado de la suma consecutiva de " + numero + " es "
				+ calcularSumaNumerosNaturalesIterativa(numero));

		System.out.println("El resultado de la suma consecutiva de " + numero + " es "
				+ calcularPotenciaFormaRecursiva(numero, 0));

		String cadena = "jose";
		invertirCadenaIterativa(cadena);

		System.out.println(invertirCadenaFormaRecursiva(cadena));

		int numeroEntero = 5988;
		System.out.println("El número " + numeroEntero + " tiene " + contarDigitosIterativa(numeroEntero) + " digitos");
		System.out.println("El número " + numeroEntero + " tiene " + contarDigitosRecursiva(numeroEntero) + " digitos");
		
		int[] arrayNumeros = {1, 2, 3, 4};
		System.out.println("Suma del array: " + sumarElementosArrayIterativo(arrayNumeros));
		System.out.println("Suma del array: " + sumarElementosArrayRecursiva(arrayNumeros, numeroEntero));
	}

	public static int factorialIterativo(int n) {

		Integer factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static int factorialRecursivo(int n) {

		if (n == 1) {
			return 1;
		}
		return factorialRecursivo(n - 1) * n;
	}

	public static int calcularPotenciaDeFormaIterativa(int base, int exponente) {
		int resultado = 1;
		for (int i = 1; i <= exponente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}

	public static int calcularPotenciaFormaRecursiva(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		} else {
			return base * calcularPotenciaFormaRecursiva(base, exponente - 1);
		}
		// Si n = 5, 5 + 4 + 3 + 2 + 1

	}

	public static int calcularSumaNumerosNaturalesIterativa(int n) {
		int suma = 0;
		for (int i = 0; i <= n; i++) {
			suma += i;
		}
		return suma;
	}

	public static int calcularSumaNumerosNaturalesRecursiva(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + calcularSumaNumerosNaturalesRecursiva(n - 1);
		}
	}

	public static void invertirCadenaIterativa(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
//			System.out.println(s.charAt(i));
		}
	}

	public static String invertirCadenaFormaRecursiva(String s) {
		if (s.length() == 1) {
			return s;
		}
		return invertirCadenaFormaRecursiva(s.substring(1)) + s.charAt(0);
	}

	public static int contarDigitosIterativa(int numero) {
		int conteo = 0;
		do {
			conteo++;
			numero = numero / 10;
		} while (numero != 0);
		return conteo;
	}

	public static int contarDigitosRecursiva(int numero) {
		if (numero == 0) {
			return 0;
		}

		return contarDigitosRecursiva(numero / 10) + 1;
	}

	public static int sumarElementosArrayIterativo(int[] array) {
		int suma = 0;
		for (int elemento: array) {
			suma += elemento;
		}
		return suma;
	}
	
	public static int sumarElementosArrayRecursiva(int[] array, int n) {
		if (n == 0) {
			return 0;
		} 
		return sumarElementosArrayRecursiva(array, n-1)+ array[n-1];
	}
	
	
	
}