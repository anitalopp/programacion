public class CalculosVarios {
	
	public class Persona {
		double altura;
		int edad;
		double peso;

		public Persona(double altura, int edad, double peso) {
			this.altura = altura;
			this.edad = edad;
			this.peso = peso;
		}

		public double calcularAGT() {
			return 0.6 * peso;
		}

		public double calcularMmc() {
			return (0.407 * peso) + (0.267 * altura) - 19.2;
		}

		public double calcularAsc() {
			return 0.007184 * peso * altura;
		}

		public double CalcularImc() {
			return peso / (altura * altura);
		}
	}
}