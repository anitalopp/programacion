
public class Ejercicio26 {
	public static void main(String[] args) {

		float peso = 40f;
		float estatura = 1.20f;
		float imc = peso / (estatura * estatura);

		if (imc < 18.5) {
			System.out.println("El paciente tiene bajo peso");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("El paciente tiene un peso normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("El paciente tiene sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("El paciente tiene obesidad de grado I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("El paciente tiene obesidad de grado II");
		} else if (imc >= 40 && imc <= 49.9) {
			System.out.println("El paciente tiene obesidad de grado III");
		} else if (imc >= 50) {
			System.out.println("El paciente tiene obesidad de grado IV");
		}
	}
}
