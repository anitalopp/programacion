package JavaFaker;
import com.github.javafaker.Faker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDatabaseSimulator {
    static class Employee {
        int id;
        String nombre;
        String apellido;
        Date fechaNacimiento;
        double salario;

        public Employee(int id, String nombre, String apellido, Date fechaNacimiento, double salario) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.salario = salario;
        }
    }

    public static void main(String[] args) {
        final int NUM_EMPLEADOS = 100;
        Employee[] empleados = new Employee[NUM_EMPLEADOS];

        // Generar empleados falsos
        Faker faker = new Faker();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < NUM_EMPLEADOS; i++) {
            int id = i + 1;
            String nombre = faker.name().firstName();
            String apellido = faker.name().lastName();
            Date fechaNacimiento = faker.date().birthday();
            double salario = faker.number().randomDouble(2, 1000, 5000); // Salario entre 1000 y 5000
            empleados[i] = new Employee(id, nombre, apellido, fechaNacimiento, salario);
        }

        // Buscar empleados por rango de edad y rango de salario
        buscarPorRangoEdad(empleados, 25, 35); // Buscar empleados entre 25 y 35 años
        buscarPorRangoSalario(empleados, 2000, 3000); // Buscar empleados con salarios entre 2000 y 3000
    }

    public static void buscarPorRangoEdad(Employee[] empleados, int edadMinima, int edadMaxima) {
        System.out.println("Empleados entre " + edadMinima + " y " + edadMaxima + " años:");
        Date fechaActual = new Date();
        for (Employee empleado : empleados) {
            int edad = calcularEdad(empleado.fechaNacimiento, fechaActual);
            if (edad >= edadMinima && edad <= edadMaxima) {
                System.out.println("ID: " + empleado.id + ", Nombre: " + empleado.nombre + " " + empleado.apellido + ", Edad: " + edad + ", Salario: $" + empleado.salario);
            }
        }
    }

    public static void buscarPorRangoSalario(Employee[] empleados, double salarioMinimo, double salarioMaximo) {
        System.out.println("\nEmpleados con salarios entre $" + salarioMinimo + " y $" + salarioMaximo + ":");
        for (Employee empleado : empleados) {
            if (empleado.salario >= salarioMinimo && empleado.salario <= salarioMaximo) {
                System.out.println("ID: " + empleado.id + ", Nombre: " + empleado.nombre + " " + empleado.apellido + ", Edad: " + calcularEdad(empleado.fechaNacimiento, new Date()) + ", Salario: $" + empleado.salario);
            }
        }
    }

    public static int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        int fechaNac = Integer.parseInt(format.format(fechaNacimiento));
        int fechaHoy = Integer.parseInt(format.format(fechaActual));
        int edad = (fechaHoy - fechaNac) / 10000;
        return edad;
    }
}
