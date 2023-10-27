
public class Ejercicio14 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
                        
            for (int j = 1; j <= 10; j++) {
                
                System.out.print(i + " x " + j + " = " + i * j);
                
                if (j < 10) {
                    System.out.print(", ");
                } else {
                	System.out.println(); 
                }
            }
            
            
        }
    }
}
