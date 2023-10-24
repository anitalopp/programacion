
public class Ejercicio28 {
    public static void main(String[] args) {

    	int edad = 55;
    	boolean esAnnArbor = true;
    	int hemoglobina = 6;
    	int ldh = 175;
    	int afectaciones = 6;
    	int contador = 0;
    	
    	if (edad > 60) {
    		contador ++;
    		
    	} if (esAnnArbor) {
    		contador ++;
    	} else { 
    	}
    	
    	if (hemoglobina < 12) {
    		contador ++;
    	} 
    	
    	if (ldh > 250) {
    		contador ++;
    	} 
    	
    	if (afectaciones >= 5) {
    		contador ++;
    	}
    	 
    
    	
    	switch (contador) {
    	case 0: case 1: 
    		System.out.println("Riesgo bajo: " + contador);
    	case 2:
    		System.out.println("Riesgo intermedio: " + contador);
    	case 3: case 4: case 5: 
    		System.out.println("Riesgo alto: " + contador);
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    }