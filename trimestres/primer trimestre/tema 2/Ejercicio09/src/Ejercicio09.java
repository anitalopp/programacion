public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 1;
		
		 if (x > 0 && y > 0) {
		     System.out.println("El punto x = " + x + ", y = " + y + " pertenece al cuadrante I.");
		 } else if (x < 0 && y > 0) {
		     System.out.println("El punto x = " + x + ", y = " + y + " pertenece al cuadrante II.");
		 } else if (x < 0 && y < 0) {
		     System.out.println("El punto x = " + x + ", y = " + y + " pertenece al cuadrante III.");
		 } else if (x > 0 && y < 0) {
		     System.out.println("El punto x = " + x + ", y = " + y + " pertenece al cuadrante IV.");
		 } else if (x == 0 && y == 0) {
		     System.out.println("El punto x = " + x + ", y = " + y + " pertenece al origen.");
		 } else {
		 System.out.println("El punto x = " + x + ", y = " + y + " no pertenece a un cuadrante ni al origen.");
		 }     		
	}

}
