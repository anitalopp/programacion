import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Se va a crear una matriz cuadrada.");
        System.out.println("Escribe las dimensiones que quieres que tenga. \nIntroduce un número entero:");
        int dimension = sc.nextInt(); 

        int[][] tablero = crearTablero(dimension); //se llama al metodo y se pasa la dimension ingresada a "tablero"
        int disparos = 0; 

        while (disparos < dimension * dimension) {
            imprimirTablero(tablero);
            System.out.println("Dispara al pianista.");
            System.out.println("Dime fila:");
            int fila = sc.nextInt(); 
            System.out.println("Dime columna:");
            int columna = sc.nextInt();

            if (fila < 1 || fila > dimension || columna < 1 || columna > dimension) {
                System.out.println("Posición fuera de rango. La matriz es de " + dimension + "x" + dimension);
                continue;
            }

            if (tablero[fila - 1][columna - 1] == 'X') { //-1 porque empieza desde 0
                System.out.println("Atención: en esa posición ya habías disparado.");
                continue; //comprueba si ya se ha disparado
            }

            tablero[fila - 1][columna - 1] = 'X';
            disparos++;

            System.out.println("Tienes " + disparos + " puntos acumulados.");
        }

        System.out.println("Fin de juego. Has hecho " + disparos + " disparos.");
    }

    public static int[][] crearTablero(int n) {
        int[][] tablero = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tablero[i][j] = random.nextInt(n) + 1; 
            }
        }

        return tablero;
    }
    // para mostrar x en el lugar donde se ha disparado
    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) { //i recorre las lineas tablero o array
            for (int j = 0; j < tablero[i].length; j++) { // recorre las columnas tablero o array
                if (tablero[i][j] == 'X') { //verifica si el numero de fila o columna coincide con un disparo ya hecho 
                    System.out.print("X ");
                } else {
                    System.out.print(tablero[i][j] + " "); //si el valor no es x vuelve a imprimir el tablero normal
                }
            }
            System.out.println(); //nueva línea
        }
    }
}
