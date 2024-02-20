package DisparenPianista;

import java.util.Random;
import java.util.Scanner;

public class Carmen {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();

        String[][] tablero = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 
                 tablero[i][j] = String.valueOf(random.nextInt(n + 1));
                 
                 
            }
        }

        int puntos = 0;


        do {
            imprimirTablero(tablero);

            System.out.print("Ingrese la fila del disparo: ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna del disparo: ");
            int columna = scanner.nextInt();

            if (tablero[fila][columna] == "X") {
                System.out.println("Ya ha disparado en esta posición antes.");
                continue;
            }
            
            puntos += Integer.parseInt(tablero[fila][columna]);
            tablero[fila][columna] = "X";
            
            System.out.println("Levas acumulados " + puntos + " puntos");
 
        }while (true);

    }

    public static void imprimirTablero(String[][] tablero) {
        System.out.println("Tablero:");
        for (String[] fila : tablero) {
            for (String casilla : fila) {
                System.out.print(casilla + " ");
            }
            System.out.println();
        }
    }

    public static boolean todasDisparadas(String[][] tablero) {
        for (String[] fila : tablero) {
            for (String casilla : fila) {
                if (casilla != "X") {
                    return false;
                }
            }
        }
        return true;
    }

}