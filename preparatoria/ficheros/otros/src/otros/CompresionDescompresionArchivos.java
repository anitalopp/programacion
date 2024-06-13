import java.io.*;
import java.util.zip.*;

/*
 * Desarrolla un programa en Java que permita comprimir 
 * y descomprimir archivos utilizando algún algoritmo 
 * de compresión, como ZIP. El programa debe aceptar como 
 * entrada el nombre del archivo a comprimir o descomprimir.
 */

public class CompresionDescompresionArchivos {
	
	public static void comprimir(String archivoEntrada, String archivoSalida) {
        try (FileInputStream fis = new FileInputStream(archivoEntrada);
             FileOutputStream fos = new FileOutputStream(archivoSalida);
             ZipOutputStream zipOut = new ZipOutputStream(fos)) {

            ZipEntry entradaZip = new ZipEntry(new File(archivoEntrada).getName());
            zipOut.putNextEntry(entradaZip);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }

            System.out.println("Archivo comprimido con éxito.");
        } catch (IOException e) {
            System.out.println("Error al comprimir el archivo.");
            e.printStackTrace();
        }
    }

    public static void descomprimir(String archivoZip, String carpetaSalida) {
        byte[] buffer = new byte[1024];
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(archivoZip))) {
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                File nuevoArchivo = new File(carpetaSalida + File.separator + zipEntry.getName());
                new File(nuevoArchivo.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(nuevoArchivo);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                zipEntry = zis.getNextEntry();
            }
            System.out.println("Archivo descomprimido con éxito.");
        } catch (IOException e) {
            System.out.println("Error al descomprimir el archivo.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java CompresionDescompresion <comp/descomp> <archivo_entrada> <archivo_salida>");
            return;
        }

        String opcion = args[0];
        String archivoEntrada = args[1];
        String archivoSalida = args[2];

        if (opcion.equals("comp")) {
            comprimir(archivoEntrada, archivoSalida);
        } else if (opcion.equals("descomp")) {
            descomprimir(archivoEntrada, archivoSalida);
        } else {
            System.out.println("Opción no válida. Use 'comp' para comprimir o 'descomp' para descomprimir.");
        }
    }

}
