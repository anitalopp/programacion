

public class Ejemplo2Unidimensional {
	
	public class Main {
	    public static void main(String[] args) {
	        int[] array = {5, 8, 2, 10, 3, 6, 7, 1, 9, 4};
	        int max = array[0];
	        
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        
	        System.out.println("El valor máximo en el array es: " + max);
	    }
	}


}
