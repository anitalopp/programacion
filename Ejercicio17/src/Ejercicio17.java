public class Ejercicio17 {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 5;
        int resultado = 0; 
        char operacion = '+';
        boolean operacionCorrecta = true;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case 'x':
            case 'X':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: División por cero.");
                    operacionCorrecta = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: División por cero.");
                    operacionCorrecta = false;
                } else {
                    resultado = num1 % num2;
                }
                break; 
            default:
                System.out.println("Operación no válida.");
                operacionCorrecta = false;
        }

        if (operacionCorrecta) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
