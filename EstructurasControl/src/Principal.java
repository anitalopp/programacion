
public class Principal {
	
	public static void main (String [] args) {

		int semanas = 4;
		int dias =7;
		
		for (int i = 1; i <= semanas; i++) {
		System.out.println("Semana: " + i);
		for (int j = 1; j <= dias; j++) {
			System.out.println("Día " + j);
			
			if (i==2) {
				System.out.println("Tratando cliente número " + i);
				continue; 
				}
				
			}
		}
		}
	}
