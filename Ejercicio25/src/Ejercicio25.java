
public class Ejercicio25 {
	public static void main(String[] args) {

		int ocular = 3;
		int verbal = 2;
		int motora = 4;

		int total = (ocular + verbal + motora);

		System.out.println("Los puntos obtenidos han sido " + total);

		if (total <= 15 & total >= 13) {
			System.out.println("El traumatismo craneoencefálico es leve");
		} else if (total <= 12 & total >= 9) {
			System.out.println("El traumatismo craneoencefálico es moderado");
		} else if (total < 9) {
			System.out.println("El traumatismo craneoencefálico es severo");
		}

	}

}
