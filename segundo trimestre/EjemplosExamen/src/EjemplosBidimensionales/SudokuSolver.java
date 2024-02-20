package EjemplosBidimensionales;

public class SudokuSolver {
	
	public static void main(String[] args) {
        int[][] tablero = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (resolverSudoku(tablero)) {
            System.out.println("Solución encontrada:");
            imprimirTablero(tablero);
        } else {
            System.out.println("No se pudo encontrar una solución.");
        }
    }

    public static boolean resolverSudoku(int[][] tablero) {
        int[] posicion = buscarCeldaVacia(tablero);
        if (posicion == null) {
            return true; // Tablero completado
        }

        int fila = posicion[0];
        int columna = posicion[1];

        for (int num = 1; num <= 9; num++) {
            if (esSeguro(tablero, fila, columna, num)) {
                tablero[fila][columna] = num;

                if (resolverSudoku(tablero)) {
                    return true; // Si la solución es válida, retornar true
                }

                tablero[fila][columna] = 0; // Si la solución no es válida, retroceder
            }
        }

        return false; // Retornar false si no se encuentra ninguna solución
    }

    public static int[] buscarCeldaVacia(int[][] tablero) {
        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                if (tablero[fila][columna] == 0) {
                    return new int[]{fila, columna};
                }
            }
        }
        return null; // No hay celdas vacías
    }

    public static boolean esSeguro(int[][] tablero, int fila, int columna, int num) {
        return !enFila(tablero, fila, num) &&
               !enColumna(tablero, columna, num) &&
               !enCuadrante(tablero, fila - fila % 3, columna - columna % 3, num);
    }

    public static boolean enFila(int[][] tablero, int fila, int num) {
        for (int columna = 0; columna < 9; columna++) {
            if (tablero[fila][columna] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean enColumna(int[][] tablero, int columna, int num) {
        for (int fila = 0; fila < 9; fila++) {
            if (tablero[fila][columna] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean enCuadrante(int[][] tablero, int inicioFila, int inicioColumna, int num) {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[inicioFila + fila][inicioColumna + columna] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void imprimirTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
