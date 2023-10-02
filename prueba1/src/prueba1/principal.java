package prueba1;

public class principal {

	public static void main (String[] args) {
		int primerNumero = 28;
		System.out.println("la variable primerNumero: " + primerNumero);
		primerNumero = 33; 
		
		int segundoNumero = 25;
		int resultado;
		
		System.out.println("la variabla primerNumero ahora vale: " + primerNumero);
		
		resultado = primerNumero + segundoNumero;		
		System.out.println("El resultado de la suma es: " + resultado);
				
		resultado = primerNumero * segundoNumero;
		System.out.println("El resultado de la multiplicación es: " + resultado);
	
		resultado = primerNumero / segundoNumero;		
		System.out.println("El resultado de la división es: " + resultado);
	
		//Calculamos el resto de la división		
		resultado = primerNumero % segundoNumero;
		System.out.println("El resto de la división es: " + resultado);
		
		System.out.println("El primer número antes de la operación unaria de incremento vale: " +primerNumero);
		++primerNumero;
		
		System.out.println("El primer número después de la operación unaria de incremento vale:" +primerNumero);
		//La operación es equivalente a hacer esto:
		
		System.out.println("El primer número antes de la operación unaria: " +primerNumero);
		primerNumero = primerNumero +1;
		
		System.out.println("El primer número después de la operación unatia de incremento vale: "+ primerNumero);
		
		System.out.println("----------PROBANDO LA SEGUNDA OPERACIÓN UNARIA----------");
		System.out.println("El valor de la variable primerNumero antes de la operación unaria es: "+primerNumero);
		System.out.println("El valor de la variable primerNumero antes de la operación unaria es: " +primerNumero++);		
	
		System.out.println("El valor de la variable primerNumero ahora vale: " + primerNumero);
		
		System.out.println("El resultado de comparar si pimerNumero es igual que el segundoNumero es: " + (primerNumero == segundoNumero));
		
		System.out.println(primerNumero > segundoNumero);
		System.out.println(segundoNumero < primerNumero);
		//Operadores de asignación
		
		System.out.println("Antes de la asignación el primer número vale: " + primerNumero);
		System.out.println("Ahora el primer Numero vale: " + segundoNumero);
		
		primerNumero = segundoNumero;
		
		//Sumar un valor a otro 
		
		segundoNumero = primerNumero + segundoNumero; 
		
		segundoNumero += primerNumero;
		
		System.out.println(segundoNumero);
		
		segundoNumero -= primerNumero; //Esto seria equivalente a segundoNumero = segundoNumero - primerNumero
		
		segundoNumero *= primerNumero; // Esto seria equivalente a segundoNmero = segundoNumero * primerNumero;
	} 
}
