package pruebasMetodo;

public class principal {
    public static void main(String[] args) {
        int ladoUno = 4;
        int ladoDos = 10;
        int area;

        area = calculaAreaRectangulo(ladoUno, ladoDos);
        System.out.println("El área del rectángulo es " + area);

        for (int i = 1; i <= 2023; i++) { // Change i > 2023 to i <= 2023
            if (esBisiesto(i)) {
                System.out.println("El año " + i + " es bisiesto");
            }
        }
    }

    public static int calculaAreaRectangulo(int ladoA, int ladoB) {
        return ladoA * ladoB;
    }

    public static boolean esBisiesto(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 4 == 0 && anno % 100 != 0) { // Change & to && and add missing modulo operator
            return true;
        } else {
            return false;
        }
    }
}
