
public class Ejercicio11 {
	public static void main (String [] args) {
		
		float consumo = 250f;  // Puedes cambiar este valor según el consumo que desees calcular
		float precioPorUnidad;

		if (consumo <= Constantes11.UMBRAL_1) {
			precioPorUnidad = Constantes11.PRECIO_1;
		} else if (consumo <= Constantes11.UMBRAL_3) {
		            precioPorUnidad = Constantes11.PRECIO_2;
		        
		} else if (consumo <= Constantes11.UMBRAL_4) {
		            precioPorUnidad = Constantes11.PRECIO_3;
		        
		} else {
		            precioPorUnidad = Constantes11.PRECIO_4;
		        
		}

		        System.out.printf("El precio de la unidad por corresponsiente al consumo " + consumo + " es " + precioPorUnidad);
		    }
		}
