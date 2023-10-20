public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		int variableX = 5;
		int variableY = 1;
		
		 if (variableX > 0 && variableY > 0) {
		     System.out.println("El punto x = " + variableX + ", y = " + variableY + " pertenece al cuadrante I.");
		 } else if (variableX < 0 && variableY > 0) {
		     System.out.println("El punto x = " + variableX + ", y = " + variableY + " pertenece al cuadrante II.");
		 } else if (variableX < 0 && variableY < 0) {
		     System.out.println("El punto x = " + variableX + ", y = " + variableY + " pertenece al cuadrante III.");
		 } else if (variableX > 0 && variableY < 0) {
		     System.out.println("El punto x = " + variableX + ", y = " + variableY + " pertenece al cuadrante IV.");
		 } else if (variableX == 0 && variableY == 0) {
		     System.out.println("El punto x = " + variableX + ", y = " + variableY + " pertenece al origen.");
		 } else {
		 System.out.println("El punto x = " + variableX + ", y = " + variableY + " no pertenece a un cuadrante ni al origen.");
		 }     		
	}

}
