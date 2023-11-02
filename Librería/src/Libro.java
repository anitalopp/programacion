
public class Libro {
	
	String titulo;
	String autor;
	float precio;
	
	public float calculaDescuento (Cliente c) {
		
		if (c.esVip()) {
			return precio * 0.8f;
		} else {
			return this.precio;
		}
			
		}
}
	