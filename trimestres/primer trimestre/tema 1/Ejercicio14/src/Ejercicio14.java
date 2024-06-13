
public class Ejercicio14 {
	
	public static void main (String [] args) {  
		
	float r= 25f;
	float grados=5f;
	float gradosRadianes=6f;
	float L= 50f;
	float area;
	
	area= L * r / 2;
	System.out.println("El área del círculo con longitud el arco exterior de 50 y radio 25 es " + area);
	
	area= (Constantes14.NUMERO_PI * (r*r) * grados) / 360; 	
	System.out.println("El área del círculo con radio 25 y con 5 grados del sector es " + area);
	
	area= ((r*r) * gradosRadianes) / 2;
	System.out.println("El área del círculo con radio 25 y con 6 expresado en radianes es " + area);

		
		
		
	}

}
