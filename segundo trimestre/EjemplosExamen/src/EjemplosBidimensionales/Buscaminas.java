package EjemplosBidimensionales;

import java.util.Random;

public class Buscaminas {
	
	public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int minas = 5;

        char[][] tablero = crearTablero(filas, columnas, minas);
        imprimirTablero(tablero);
    }

    public static char[][] crearTablero(int filas, int columnas, int minas) {
        char[][] tablero = new char[filas][columnas];
        Random random = new Random();

        // Inicializar el tablero
        for (char[] fila : tablero) {
            java.util.Arrays.fill(fila, '-');
        }

        // Colocar minas aleatoriamente
        for (int i = 0; i < minas; i++) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            tablero[fila][columna] = '*';
        }

        return tablero;
    }

    public static void imprimirTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

}
