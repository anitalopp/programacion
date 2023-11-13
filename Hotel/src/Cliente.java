public class Cliente {

		private String nombre;
		private int edad;
		private String ciudad;
		private String dni;
		private String apellido;

		public Cliente(String dni, String nombre, String apellido, int edad, String ciudad) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
		}

		public void setDni (String dni) {
			this.dni = dni;
		}

		public String nombre () {
			return this.nombre;  
		}

		public void setEdad(int edad) {
			if (edad < 0) {
				this.edad = 10;
			} else {
				this.edad = edad;
			}
		}

		public int getEdad() {
			return this.edad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getCiudad() {
			return this.ciudad;
		}

		public boolean esVip() {
			// Consulta a la base de datos cuánto ha gastado en el último año

			boolean tieneGastoAlto = true;

			if (tieneGastoAlto)
				return true;

			return false;

		}
	}
}
