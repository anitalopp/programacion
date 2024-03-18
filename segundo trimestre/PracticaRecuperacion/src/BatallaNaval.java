import java.util.Random;
import java.util.Scanner;

public class BatallaNaval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego de Batalla Naval!\n");

        // Tamaño de la cuadrícula
        int tamano = 5;

        // Tablero del usuario y de la computadora
        char[][] tableroUsuario = generarTablero(tamano);
        char[][] tableroComputadora = generarTablero(tamano);

        // Colocar barcos en el tablero del usuario y de la computadora
        colocarBarcos(tableroUsuario, random);
        colocarBarcos(tableroComputadora, random);

        // Juego
        while (true) {
            // Turno del usuario
            System.out.println("Tablero del Usuario:");
            mostrarTablero(tableroUsuario);
            System.out.println("\nTablero de la Computadora:");
            mostrarTableroOculto(tableroComputadora);
            System.out.print("Coordenadas de ataque del Usuario: ");
            int filaUsuario = scanner.nextInt() - 1;
            int columnaUsuario = scanner.nextInt() - 1;
            realizarAtaque(tableroComputadora, filaUsuario, columnaUsuario);
            if (esGanador(tableroComputadora)) {
                System.out.println("¡Felicidades! Has hundido todos los barcos de la Computadora. ¡Eres el ganador!");
                break;
            }

            // Turno de la computadora
            int filaComputadora = random.nextInt(tamano);
            int columnaComputadora = random.nextInt(tamano);
            realizarAtaque(tableroUsuario, filaComputadora, columnaComputadora);
            System.out.println("\nLa Computadora ha realizado un ataque en la fila " + (filaComputadora + 1) +
                    " y columna " + (columnaComputadora + 1) + ".");
            if (esGanador(tableroUsuario)) {
                System.out.println("¡La Computadora ha hundido todos tus barcos! ¡Has perdido!");
                break;
            }
        }

        scanner.close();
    }

    public static char[][] generarTablero(int tamano) {
        char[][] tablero = new char[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                tablero[i][j] = '-';
            }
        }
        return tablero;
    }

    public static void mostrarTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.print("| " + celda + " ");
            }
            System.out.println("|");
        }
    }

    public static void mostrarTableroOculto(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                if (celda == 'X' || celda == '-') {
                    System.out.print("| " + celda + " ");
                } else {
                    System.out.print("| - ");
                }
            }
            System.out.println("|");
        }
    }

    public static void colocarBarcos(char[][] tablero, Random random) {
        int cantidadBarcos = 3; // Puedes ajustar la cantidad de barcos si lo deseas
        int tamano = tablero.length;
        while (cantidadBarcos > 0) {
            int fila = random.nextInt(tamano);
            int columna = random.nextInt(tamano);
            if (tablero[fila][columna] != 'B') {
                tablero[fila][columna] = 'B';
                cantidadBarcos--;
            }
        }
    }

    public static void realizarAtaque(char[][] tablero, int fila, int columna) {
        if (tablero[fila][columna] == 'B') {
            System.out.println("¡Impacto! Has golpeado un barco.");
            tablero[fila][columna] = 'X'; // Barco hundido
        } else {
            System.out.println("¡Agua! No has golpeado ningún barco.");
        }
    }

    public static boolean esGanador(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                if (celda == 'B') {
                    return false; // Aún hay barcos en el tablero
                }
            }
        }
        return true; // Todos los barcos han sido hundidos
    }
}