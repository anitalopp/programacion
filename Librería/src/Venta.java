
public class Venta {
		
	Libro libro;
	Cliente cliente;
	int cantidad;
	
	public void registraVenta() {
		//código para registrar una venta
	
		System.out.println("Registrando venta de cliente " + this.cliente + " del libro " + libro.titulo + " cantidad " + this.cantidad);
		
	}
}
