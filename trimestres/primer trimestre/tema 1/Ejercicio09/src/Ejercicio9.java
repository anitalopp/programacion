
public class Ejercicio9 {
	public static void main(String[] args) {

		int minutos= 7978789;
		int años;
		int dias;
		int minutosEnAno = 60 * 24 * 365;
	
		
		años = (minutos / minutosEnAno);
		dias = (minutos / 60 * 24);
		
		System.out.println("El resultado de calcular los años es " + años);
		System.out.println("El resultado de calcular los días es " + dias);

	}
}
