package EjemplosBidimensionales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JuegoSerpiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10; // Tamaño del tablero

        // Inicializar el tablero
        char[][] tablero = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablero[i][j] = '.';
            }
        }

        // Inicializar la serpiente
        Queue<int[]> snake = new LinkedList<>();
        snake.offer(new int[]{0, 0}); // Posición inicial de la cabeza de la serpiente

        // Bucle principal del juego
        while (true) {
            // Imprimir el tablero con la serpiente
            imprimirTablero(tablero, snake);

            // Obtener la dirección del movimiento
            System.out.print("Ingrese la dirección (arriba, abajo, izquierda, derecha): ");
            String direccion = scanner.nextLine().toLowerCase();

            // Mover la serpiente
            moverSerpiente(tablero, snake, direccion);

            // Comprobar si la serpiente ha chocado o ha salido del tablero
            if (!esMovimientoValido(tablero, snake.peek())) {
                System.out.println("¡Game Over!");
                break;
            }
        }

        scanner.close();
    }

    public static void imprimirTablero(char[][] tablero, Queue<int[]> snake) {
        int n = tablero.length;

        // Limpiar el tablero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablero[i][j] = '.';
            }
        }

        // Dibujar la serpiente en el tablero
        for (int[] posicion : snake) {
            int fila = posicion[0];
            int columna = posicion[1];
            tablero[fila][columna] = 'O';
        }

        // Imprimir el tablero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void moverSerpiente(char[][] tablero, Queue<int[]> snake, String direccion) {
        int[] head = snake.peek();
        int fila = head[0];
        int columna = head[1];

        switch (direccion) {
            case "arriba":
                fila--;
                break;
            case "abajo":
                fila++;
                break;
            case "izquierda":
                columna--;
                break;
            case "derecha":
                columna++;
                break;
        }

        snake.offer(new int[]{fila, columna}); // Mover la cabeza de la serpiente

        // Eliminar la cola de la serpiente si ha crecido
        if (tablero[fila][columna] != '.') {
            snake.poll();
        }
    }

    public static boolean esMovimientoValido(char[][] tablero, int[] posicion) {
        int n = tablero.length;
        int fila = posicion[0];
        int columna = posicion[1];
        return fila >= 0 && fila < n && columna >= 0 && columna < n;
    }
}