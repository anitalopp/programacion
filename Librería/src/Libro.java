
public class Libro {
	
	String titulo;
	private String autor;
	private float precio;
	
	public Libro(String Titulo, String autor, float precio) {
		this.titulo = Titulo ;
		this.autor = autor;
		this.precio = precio;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo () {
		return this.titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	} 
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public float calculaDescuento (Cliente c) {
		
		if (c.esVip()) {
			return precio * 0.8f;
		} else {
			return this.precio;
		}
		
		
	}
		
		public float convertirEurosADolares(float euros) {
			return euros * 1.2f;
		
		} 
}
	