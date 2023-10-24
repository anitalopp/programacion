
public class Ejercicio29 {
	public static void main (String [] args) {
		
		int edad = 45;
		boolean esNegro = true;
		int estadio = 3;
		int contador = 0;
		
		if (edad <59 & edad >40) {
			contador ++;
		}
		if (esNegro) {
			contador ++;
		} 
		if (estadio == 3 & estadio == 4) {
			contador += 2;
		} 
		if (edad >=80) {
			contador += 4;
		}
		
		switch (contador) {
		case 0: case 1:
			System.out.println("Riesgo alto de supervivencia");
		break;
		case 2: 
			System.out.println("Riesgo intermedio-alto de supervivencia");
		break;
		case 3:
			System.out.println("Riego intermedio-bajo de supervivencia");
		break;
		case 4: case 5: case 6: case 7: 
			System.out.println("Riesgo bajo de supervivencia");
		break;
		}
		System.out.println(contador);
		
	}
}
