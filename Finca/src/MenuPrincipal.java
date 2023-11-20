import java.util.Scanner;

import com.ana.finca.entidades.FincaCircular;
import com.ana.finca.entidades.FincaRectangular;
import com.ana.finca.menu.MenuFincaCircular;
import com.ana.finca.menu.MenuFincaRectangular;
import com.ana.finca.menu.MenuPoligonoRegular;
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
                	MenuFincaRectangular mv = new MenuFincaRectangular();
                	mv.mostrarMenu();
                	break;
                case 2:
                    MenuFincaCircular mi = new MenuFincaCircular();
                    mi.mostrarMenu();
                    break;
                case 3:
                	MenuPoligonoRegular md = new MenuPoligonoRegular();
                	md.mostrarMenu();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción incorrecta: El número debe estar comprendido entre 1 y 3");
            }
        } while (opcion != 4);
    }
}
