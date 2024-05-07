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
	}

}
//
//	public static void Ejecicio2(String args[]) throws IOException {
//
//		List<Login> listaLogins = new ArrayList<>();
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Dígame la ruta del fichero");
//		String rutaCsv = sc.nextLine();
//		File f = new File(rutaCsv);
//
//		FileReader fr = new FileReader(f);
//
//		BufferedReader bf = new BufferedReader(fr);
//		String linea;
//		while ((linea = bf.readLine()) != null) {
//			String[] arrayLogin = linea.split(";");
//			Login l = new Login(arrayLogin[0], arrayLogin[1], (arrayLogin[2]));
//			listaLogins.add(l);
//
//		}
//
//		Collections.sort(listaLogins, new ComparadorNombre());
//		for (Login l : listaLogins) {
//			System.out.println("LogDTO [id=" + l.getId()+ "," + "nombre=" + l.getNombre();
//		}
//
//	}
//
//}
