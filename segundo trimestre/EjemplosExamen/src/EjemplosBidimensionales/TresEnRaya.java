package EjemplosBidimensionales;

import java.util.Scanner;

public class TresEnRaya {
	
	public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        boolean turnoX = true;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero(tablero);

            char jugador = turnoX ? 'X' : 'O';
            System.out.println("Turno del jugador " + jugador);
            System.out.print("Ingrese la fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna (0-2): ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ') {
                System.out.println("Movimiento inválido, intente de nuevo.");
                continue;
            }

            tablero[fila][columna] = jugador;

            if (hayGanador(tablero, jugador)) {
                imprimirTablero(tablero);
                System.out.println("¡El jugador " + jugador + " ha ganado!");
                break;
            }

            if (hayEmpate(tablero)) {
                imprimirTablero(tablero);
                System.out.println("¡Empate!");
                break;
            }

            turnoX = !turnoX;
        }

        scanner.close();
    }

    public static void imprimirTablero(char[][] tablero) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean hayGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true; // Ganó en una fila
            }
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                return true; // Ganó en una columna
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true; // Ganó en la diagonal principal
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true; // Ganó en la diagonal secundaria
        }
        return false;
    }

    public static boolean hayEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay casillas vacías
                }
            }
        }
        return true; // No hay casillas vacías, es un empate
    }

}
