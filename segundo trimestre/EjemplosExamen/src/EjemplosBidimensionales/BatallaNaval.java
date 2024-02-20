package EjemplosBidimensionales;

public class BatallaNaval {
	
	public static void main(String[] args) {
        char[][] tablero = {
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };

        colocarBarcos(tablero);

        imprimirTablero(tablero);
    }

    public static void colocarBarcos(char[][] tablero) {
        // Colocar barcos aleatoriamente
        for (int barco = 1; barco <= 5; barco++) {
            int fila = (int) (Math.random() * 9);
            int columna = (int) (Math.random() * 9);
            tablero[fila][columna] = 'B';
        }
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
