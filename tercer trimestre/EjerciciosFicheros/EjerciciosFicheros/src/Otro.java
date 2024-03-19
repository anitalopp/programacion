import java.io.*;

public class Otro {

    public static void main(String args[]) {
//        ejecutarEjercicio1();
        ejecutarEjercicio2();
        ejecutarEjercicio3();
    }

    public static void ejecutarEjercicio1() {
        System.out.println("========EJERCICIO 1========");
        System.out.println("===========================");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Dígame el directorio para empezar a buscar: ");
            String directorio = reader.readLine();

            System.out.println("Dígame nombre de fichero a buscar");
            String patronBusqueda = reader.readLine();
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }

    private static void ejecutarEjercicio2() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("========EJERCICIO 2========");
            System.out.println("===========================");

            System.out.println("Introduce el nombre del fichero donde se almacenarán los datos: ");
            String nombreFichero = reader.readLine();

            System.out.println("Introduce tu nombre:");
            String nombre = reader.readLine();

            System.out.println("Introduce tu edad:");
            String edad = reader.readLine();

            System.out.println("Introduce tu correo electrónico:");
            String correo = reader.readLine();

            if (correo.contains("@")) {
                System.out.println("Usuario registrado con éxito");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
                    String contenidoFichero = "Nombre: " + nombre + ", Edad:" + edad + ", Correo:" + correo;
                    writer.write(contenidoFichero);
                    System.out.println("Se ha escrito correctamente en el archivo.");
                } catch (IOException e) {
                    System.err.println("Error al escribir en el archivo: " + e.getMessage());
                }
            } else {
                System.out.println("No se puede crear");
            }
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }

    public static void ejecutarEjercicio3() {
        System.out.println("========EJERCICIO 3========");
        System.out.println("===========================");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Introduce el nombre del fichero para guardar los resultados:");
            String nombreFichero = reader.readLine();

            System.out.println("Introduce un directorio para listar su contenido:");
            String directorio = reader.readLine();

            File carpeta = new File(directorio);

            String[] listado = carpeta.list();

            if (listado == null || listado.length == 0) {
                System.out.println("Introduzca un directorio");
                return;
            } else {
                for (String archivo : listado) {
                    System.out.println(archivo);
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
                for (String archivo : listado) {
                    writer.write(archivo + "\n");
                }
                System.out.println("Se ha escrito correctamente en el archivo.");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }

            System.out.println("Introduce el nombre de un fichero para buscar una palabra");
            String nombreFicheroBuscarPalabra = reader.readLine();

            System.out.println("Introduce la palabra a buscar: ");
            String palabraBuscada = reader.readLine();

            try (BufferedReader fileReader = new BufferedReader(new FileReader(nombreFicheroBuscarPalabra))) {
                String linea;
                while ((linea = fileReader.readLine()) != null) {
                    if (linea.contains(palabraBuscada)) {
                        System.out.println("La palabra '" + palabraBuscada + "' se encuentra en el archivo");
                    }
                }
            } catch (IOException e) {
                System.err.println("Error de lectura del archivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}

