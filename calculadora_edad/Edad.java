package calculadora_edad;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Edad {

    public int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        if ((fechaNacimiento != null) && (fechaActual != null)) {
            return Period.between(fechaNacimiento, fechaActual).getYears();
        } else {
            return 0;
        }
    }

    public LocalDate solicitarFechaNacimiento() {
        Scanner scanner = new Scanner(System.in);

        int anio = 0, mes = 0, dia = 0;

        try {
            System.out.println("Ingrese el año de nacimiento:");
            anio = scanner.nextInt();

            System.out.println("Ingrese el mes de nacimiento:");
            mes = scanner.nextInt();

            System.out.println("Ingrese el día de nacimiento:");
            dia = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
            scanner.close();
            System.exit(1);
        }

        scanner.close();

        return LocalDate.of(anio, mes, dia);
    }

    public int obtenerEdad() {
        LocalDate fechaNacimiento = solicitarFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();
        return calcularEdad(fechaNacimiento, fechaActual);
    }

    public static void main(String[] args) {
        Edad edad = new Edad();
        int edadCalculada = edad.obtenerEdad();
        System.out.println("La edad calculada es: " + edadCalculada + " años.");
    }
}
