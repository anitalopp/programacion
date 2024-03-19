package SuperGrep;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // Solicita al usuario que introduzca el directorio a buscar.
        System.out.print("Dime el directorio del disco duro: ");
        String directorio = sc.nextLine();
        while (directorio.isEmpty()) {
            // Verifica si el directorio introducido está vacío y solicita al usuario que lo introduzca de nuevo en caso afirmativo.
            System.out.print("No has introducido ningún directorio. Inténtalo de nuevo: ");
            directorio = sc.nextLine();
        }

        // Solicita al usuario que introduzca una fecha (opcional) en el formato DD/MM/AAAA.
        System.out.print("Dime una fecha (formato DD/MM/AAAA, dejar en blanco para buscar en todos los archivos): ");
        String fecha = sc.nextLine();

        // Solicita al usuario que introduzca la palabra que desea buscar.
        System.out.print("Dime la palabra a buscar: ");
        String palabra = sc.nextLine();

        // Borra los archivos en el directorio de destino especificado.
        borrarArchivos(Constantes.DIRECTORIO_DESTINO);

        // Busca archivos en el directorio especificado y sus subdirectorios que contienen la palabra especificada.
        buscarArchivos(directorio, fecha, palabra);

        sc.close();
    }

    public static void borrarArchivos(String ruta) {
        // Obtiene la carpeta en la ruta especificada.
        File carpeta = new File(ruta);
        // Obtiene la lista de archivos en la carpeta.
        File[] archivos = carpeta.listFiles();

        // Verifica si la lista de archivos no es nula.
        if (archivos != null) {
            // Recorre la lista de archivos y los elimina.
            for (File archivo : archivos) {
                archivo.delete();
            }
        }
    }

    public static void buscarArchivos(String ruta, String fecha, String palabra) throws IOException {
        // Obtiene el archivo en la ruta especificada.
        File file = new File(ruta);
        // Obtiene la lista de archivos en la carpeta.
        File[] arrayArchivos = file.listFiles();
        // Obtiene la ruta de destino como un objeto Path.
        Path destinationPath = Paths.get(Constantes.DIRECTORIO_DESTINO);

        // Recorre la lista de archivos.
        for (File f : arrayArchivos) {
            // Verifica si el elemento es un archivo y si su extensión es .txt.
            if (f.isFile() && f.getName().endsWith(".txt")) {
                // Registra en el log la ruta del archivo que está siendo analizado.
                log("Analizando directorio/archivo: " + f.getAbsolutePath());

                // Verifica si la fecha está vacía o si la fecha de modificación del archivo es posterior a la fecha proporcionada.
                if (fecha.isEmpty() || fechaPosterior(f, fecha)) {
                    // Lee el archivo línea por línea en busca de la palabra especificada.
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String linea;
                    boolean encontrado = false;

                    while ((linea = br.readLine()) != null) {
                        // Si la línea contiene la palabra, imprime un mensaje y copia el archivo al directorio de destino.
                        if (linea.contains(palabra)) {
                            System.out.println("Palabra encontrada en el fichero " + f.getName());
                            encontrado = true;
                            Files.copy(f.toPath(), destinationPath.resolve(f.getName()));
                            // Registra en el log que se encontró la palabra.
                            log("Palabra \"" + palabra + "\" encontrada!!!");
                            break;
                        }
                    }

                    // Si la palabra no se encontró en el archivo, registra un mensaje en el log.
                    if (!encontrado) {
                        log("Palabra \"" + palabra + "\" no encontrada en el archivo " + f.getName());
                    }

                    // Cierra el lector de archivos.
                    br.close();
                    fr.close();
                }
            } else if (f.isDirectory()) {
                // Si el elemento es un directorio, se llama a la función de búsqueda recursivamente para ese directorio.
                buscarArchivos(f.getAbsolutePath(), fecha, palabra);
            }
        }
    }

    public static boolean fechaPosterior(File file, String fecha) {
        // Define el formato de fecha.
        String formatoFecha = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);

        try {
            // Obtiene la fecha de modificación del archivo.
            Date fechaArchivo = new Date(file.lastModified());
            // Parsea la fecha proporcionada.
            Date fechaComparacion = sdf.parse(fecha);
            // Compara las fechas y devuelve true si la fecha del archivo es posterior a la fecha proporcionada.
            return fechaArchivo.after(fechaComparacion);
        } catch (Exception e) {
            // Imprime el error en caso de excepción.
            e.printStackTrace();
            return false;
        }
    }

    public static void log(String mensaje) throws IOException {
        // Define el formato de fecha y hora.
        String formatoFechaHora = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFechaHora);
        // Obtiene la fecha y hora actual.
        String fechaHora = sdf.format(new Date());

        // Define el nombre del archivo de registro con el formato superGrep_DDMMYY.log.
        String nombreArchivo = "superGrep_" + new SimpleDateFormat("ddMMyy").format(new Date()) + ".log";
        // Crea un escritor de archivo y un escritor de impresión para el archivo de registro.
        FileWriter fw = new FileWriter(nombreArchivo, true);
        PrintWriter pw = new PrintWriter(fw);

        // Escribe el mensaje de registro en el archivo junto con la fecha y hora.
        pw.println(fechaHora + " - " + mensaje);

        // Cierra el escritor de impresión y el escritor de archivos.
        pw.close();
        fw.close();
    }
}
