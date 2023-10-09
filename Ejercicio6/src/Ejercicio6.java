 
public class Ejercicio6 {
	public static void main(String[] args) {
		
		float numMetros= 25f;
		int numHoras= 50;
		int numMinutos= 90;
		int numSegundos= 20;
		float velocidad;
		
		
	velocidad= numMetros / (numSegundos + (numMinutos * 60)+(numHoras * 3600)) ;
	

	System.out.println("La velocidad en la que se ha recorrido los 25 metros es : " + velocidad + " metros/segundo");


	}
}
