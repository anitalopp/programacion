
public class EjemploBidimensional {
	int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	// Acceso a un elemento
	int valor = matriz[1][2]; {
		// Accede al elemento en la segunda fila y tercera columna (valor 6)

	// Recorrido del array bidimensional
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
	        System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println(); // Nueva línea después de cada fila
	}
}}

