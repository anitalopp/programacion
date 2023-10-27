
public class Ejercicio27 {
	public static void main(String[] args) {

		int albuminica = 2;
		float hemoglobina = 10f;
		int edad = 25;
		int recuento = 12000;
		int linfocitos_mm3 = 550;
		int linfocitos_p = 5;
		int contador = 0;

		if (albuminica < 4) {
			contador += 1;
		}
		if (hemoglobina < 10) {
			contador += 1;
		}
		if (edad >= 45) {
			contador += 1;
		}
		if (recuento >= 15000) {
			contador += 3;
		}
		if (linfocitos_mm3 < 600 & linfocitos_p > 8) {
			contador += 1;
		}

		switch (contador) {
		case 0:
			System.out.println("84 % supervivencia sin progresión y 89 % supervivencia general.");
			break;
		case 1:
			System.out.println("77 % supervivencia sin progresión y 90 % supervivencia general");
			break;
		case 2:
			System.out.println("67 % supervivencia sin progresión y 81 % supervivencia general.");
			break;
		case 3:
			System.out.println("60 % supervivencia sin progresión y 78 % supervivencia general");
			break;
		case 4:
			System.out.println("51 % supervivencia sin progresión y 61 % supervivencia general.");
			break;
		case 5:
			System.out.println("42 % supervivencia sin progresión y 56 % supervivencia general.");

		}

	}
}
