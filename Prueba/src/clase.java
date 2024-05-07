import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        List<Alumno> listaAlumnos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Dígame la ruta del fichero de alumnos");
        String rutaFicheroAlumnos = sc.nextLine();
        File f = new File(rutaFicheroAlumnos);

        FileReader fr = new FileReader(f);

        BufferedReader bf = new BufferedReader(fr);
        String linea;
        while ((linea = bf.readLine()) != null) {
            String[] arrayAlumnos = linea.split(";");
            Alumno a = new Alumno(arrayAlumnos[0], arrayAlumnos[1], Integer.parseInt(arrayAlumnos[2]));
            listaAlumnos.add(a);

        }

        List<Nota> listaNotas = new ArrayList<>();

        System.out.println("Dígame la ruta del fichero de notas");
        String rutaFicheroNotas = sc.nextLine();

        f = new File(rutaFicheroNotas);

        fr = new FileReader(f);

        bf = new BufferedReader(fr);

        while ((linea = bf.readLine()) != null) {
            String[] arrayNotas = linea.split(";");
            Nota n = new Nota(arrayNotas[0], arrayNotas[1], Integer.parseInt(arrayNotas[2]));
            listaNotas.add(n);
        }

        System.out.println("================Listado de Alumnos con asignaturas================");
        if (listaAlumnos != null && listaNotas != null) {
            for (Alumno alumno : listaAlumnos) {
                System.out.println("Alumno: " + alumno.getNombreApellido());
                for (Nota nota : listaNotas) {
                    if (nota.getDni().equals(alumno.getDni())) {
                        System.out.println("Asignatura: " + nota.getAsignatura() + " Nota: " + nota.getNota());
                    }
                }

            }
        }

        System.out.println("================Alumnos ordenados por edad================");
        Collections.sort(listaAlumnos, new ComparadorEdad());
        for (Alumno a : listaAlumnos) {
            System.out.println("Alumnos [dni=" + a.getDni() + ", nombreApellido=" + a.getNombreApellido() + ", edad="
                    + a.getEdad());
        }

        System.out.println("================Alumnos ordenados por nombre================");
        Collections.sort(listaAlumnos, new ComparadorNombre());
        for (Alumno a : listaAlumnos) {
            System.out.println("Alumnos [dni=" + a.getDni() + ", nombreApellido=" + a.getNombreApellido() + ", edad="
                    + a.getEdad());
        }

        System.out.println("================Alumnos ordenados por DNI================");
        Collections.sort(listaAlumnos, new ComparadorDni());
        for (Alumno a : listaAlumnos) {
            System.out.println("Alumnos [dni=" + a.getDni() + ", nombreApellido=" + a.getNombreApellido() + ", edad="
                    + a.getEdad());
        }

        System.out.println("================Alumnos ordenados por número de suspensos================");
        Collections.sort(listaAlumnos, new ComparadorSuspensos(listaNotas));
        for (Alumno a : listaAlumnos) {
            int suspensos = contarSuspensos(a.getDni(), listaNotas);
            System.out.println("Alumno [dni=" + a.getDni() + ", nombreApellido=" + a.getNombreApellido() + ", edad="
                    + a.getEdad() + ", suspensos=" + suspensos);
        }

        System.out.println("================Alumnos ordenados por nota media================");
        Collections.sort(listaAlumnos, new ComparadorNotaMedia(listaNotas));
        for (Alumno a : listaAlumnos) {
            double media = calcularNotaMedia(a.getDni(), listaNotas);
            System.out.println("Alumno [dni=" + a.getDni() + ", nombreApellido=" + a.getNombreApellido() + ", edad="
                    + a.getEdad() + ", notaMedia=" + media);
        }

    }

    private static int contarSuspensos(String dni, List<Nota> notas) {
        int suspensos = 0;
        for (Nota nota : notas) {
            if (nota.getDni().equals(dni) && nota.getNota() < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    private static double calcularNotaMedia(String dni, List<Nota> notas) {
        double suma = 0;
        int contador = 0;
        for (Nota nota : notas) {
            if (nota.getDni().equals(dni)) {
                suma += nota.getNota();
                contador++;
            }
        }
        return contador == 0 ? 0 : suma / contador;
    }
}
