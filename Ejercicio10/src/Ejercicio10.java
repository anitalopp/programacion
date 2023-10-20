
public class Ejercicio10 {
	public static void main (String [] args) {
		
		float matematicas = 10f;
		float fisica = 4f;
		float quimica = 9f;
		
		if (matematicas >= 6.5 || fisica >= 6 || quimica >= 5 || matematicas + fisica + quimica % 3 == 7) {
			System.out.println("El candidato es elegible");
		} else { 
			System.out.println("El candidato no es elegible");
		}
	}
}
