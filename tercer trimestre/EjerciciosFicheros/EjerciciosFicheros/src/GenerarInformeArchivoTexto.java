import java.io.*;
import java.util.*;

/*
 * Desarrolla un programa en Java que lea un archivo de 
 * texto con información sobre ventas (producto, cantidad, 
 * precio, etc.) y genere un informe resumido, como el total 
 * de ventas, el producto más vendido, el promedio de 
 * precios, etc.
 */

public class GenerarInformeArchivoTexto {
	
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java InformeVentas <archivo_ventas>");
            return;
        }

        String archivoVentas = args[0];
        Map<String, Integer> productosVendidos = new HashMap<>();
        int totalVentas = 0;
        double sumaPrecios = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoVentas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosVenta = linea.split(",");
                String producto = datosVenta[0];
                int cantidad = Integer.parseInt(datosVenta[1]);
                double precio = Double.parseDouble(datosVenta[2]);

                totalVentas += cantidad;
                sumaPrecios += cantidad * precio;

                productosVendidos.put(producto, productosVendidos.getOrDefault(producto, 0) + cantidad);
            }

            // Producto más vendido
            String productoMasVendido = Collections.max(productosVendidos.entrySet(), Map.Entry.comparingByValue()).getKey();

            // Promedio de precios
            double promedioPrecios = sumaPrecios / totalVentas;

            System.out.println("Informe de ventas:");
            System.out.println("Total de ventas: " + totalVentas);
            System.out.println("Producto más vendido: " + productoMasVendido);
            System.out.println("Promedio de precios: " + promedioPrecios);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de ventas.");
            e.printStackTrace();
        }
    }

}
