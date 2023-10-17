
public class Ejercicio4 {
	public static void main (String [] args) {
		
		int anos = 1996;
		
		if (anos % 400 == 0) {
			System.out.println("El año es bisiesto");			
		} else if (anos % 4 == 0 && anos % 100!=0){ 
			System.out.println("El año es bisiesto");	
		} else {
			System.out.println("El año no es bisiesto");
		}
		
	}
}
