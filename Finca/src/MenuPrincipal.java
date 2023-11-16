import java.util.Scanner;

import com.ana.finca.entidades.FincaCircular;
import com.ana.finca.entidades.FincaRectangular;
import com.ana.finca.entidades.FincaPoligonoRegular;

public class MenuPrincipal {

    public void muestraMenuPrincipal() {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        FincaRectangular rectangular;
        FincaCircular circular;
        FincaPoligonoRegular poligono;

        do {
            System.out.println("*********************************************");
            System.out.println("*******APLICACIÓN DE GESTIÓN DE FINCAS*******");
            System.out.println("*********************************************");

            System.out.println("Introduzca la acción que quiera realizar:");
            System.out.println();
            System.out.println("1- Gestión de fincas rectangulares.");
            System.out.println("2- Gestión de fincas circulares.");
            System.out.println("3- Gestión de fincas con forma de polígono regulat.");
            System.out.println("4- Salir.");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    rectangular = new FincaRectangular();
                    rectangular.Rectangular();
                    break;
                case 2:
                    circular = new FincaCircular();
                    circular.Circular();
                    break;
                case 3:
                	poligono = new FincaPoligonoRegular();
                	poligono.Poligono();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta: El número debe estar comprendido entre 1 y 4");
            }
        } while (opcion != 4);
    }
}
