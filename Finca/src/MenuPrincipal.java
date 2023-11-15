import java.util.Scanner;

public class MenuPrincipal {

    public void muestraMenuPrincipal() {
    	
    	int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Rectangular rectangular;
        Circular circular;
        Poligono poligono;
        
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
                     // Submenú de finca reactangular
             		MenuPrincipal menuPrincipal = new MenuPrincipal();
            		MenuPrincipal mp = new MenuPrincipal();
            		mp.muestraMenuPrincipal();
                	 break;
                 case 2:
                     // Submenú de finca circular
                     break;
                 case 3:
                     // Submenú de finca circular
                     break;
                 case 4:
                     // Salir
                	 System.out.println("Saliendo del submenú...");
                     break;
                 default:
                     System.out.println("Opción incorrecta: El número debe estar comprendido entre 1 y 4");
    
    
             } while (opcion != 4); } while (opcion != 4);

     	 
}
}