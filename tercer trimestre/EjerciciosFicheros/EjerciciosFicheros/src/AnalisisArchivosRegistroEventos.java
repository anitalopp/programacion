import java.io.*;
import java.util.*;

/*
 * Desarrolla un programa en Java que analice un archivo 
 * de registro de eventos y genere un resumen de la cantidad 
 * de eventos por tipo, el promedio de duración de los 
 * eventos, y el evento más largo y más corto registrado.
 */

public class AnalisisArchivosRegistroEventos {
	
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java AnalisisRegistroEventos <archivo_registro>");
            return;
        }

        String archivoRegistro = args[0];
        Map<String, Integer> eventosPorTipo = new HashMap<>();
        double totalDuracion = 0;
        long eventoMasLargo = Long.MIN_VALUE;
        long eventoMasCorto = Long.MAX_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoRegistro))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosEvento = linea.split(",");
                String tipoEvento = datosEvento[0];
                long duracionEvento = Long.parseLong(datosEvento[1]);

                // Conteo de eventos por tipo
                eventosPorTipo.put(tipoEvento, eventosPorTipo.getOrDefault(tipoEvento, 0) + 1);

                // Actualización de la duración total
                totalDuracion += duracionEvento;

                // Actualización del evento más largo y más corto
                if (duracionEvento > eventoMasLargo) {
                    eventoMasLargo = duracionEvento;
                }
                if (duracionEvento < eventoMasCorto) {
                    eventoMasCorto = duracionEvento;
                }
            }

            // Cálculo del promedio de duración
            double promedioDuracion = totalDuracion / eventosPorTipo.size();

            // Evento más corto y más largo
            String tipoEventoMasLargo = "";
            String tipoEventoMasCorto = "";
            for (Map.Entry<String, Integer> entry : eventosPorTipo.entrySet()) {
                if (entry.getValue() == eventoMasLargo) {
                    tipoEventoMasLargo = entry.getKey();
                }
                if (entry.getValue() == eventoMasCorto) {
                    tipoEventoMasCorto = entry.getKey();
                }
            }

            System.out.println("Resumen del archivo de registro:");
            System.out.println("Eventos por tipo: " + eventosPorTipo);
            System.out.println("Promedio de duración de eventos: " + promedioDuracion);
            System.out.println("Evento más largo (" + tipoEventoMasLargo + "): " + eventoMasLargo);
            System.out.println("Evento más corto (" + tipoEventoMasCorto + "): " + eventoMasCorto);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de registro.");
            e.printStackTrace();
        }
    }

}
