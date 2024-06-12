package conversor;

import java.util.Scanner;

public class Monedas {

    double QUETZAL_TO_DOLLAR = 0.13;
    double DOLLAR_TO_QUETZAL = 7.75;
    double QUETZAL_TO_PESO= 2.60;
    double PESO_MXN_TO_QUETZAL = 0.38;

    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarOpciones();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirQuetzalesADolares();
                    break;
                case 2:
                    convertirDolaresAQuetzales();
                    break;
                case 3:
                    convertirQuetzalesAPesosMexicanos();
                    break;
                case 4:
                    convertirPesosMexicanosAQuetzales();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarOpciones() {
        System.out.println("Opciones:");
        System.out.println("1. Quetzales a Dólares");
        System.out.println("2. Dólares a Quetzales");
        System.out.println("3. Quetzales a Pesos Mexicanos");
        System.out.println("4. Pesos Mexicanos a Quetzales");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void convertirQuetzalesADolares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Quetzales: ");
        double quetzales = scanner.nextDouble();
        double dolares = quetzales * QUETZAL_TO_DOLLAR_RATE;
        System.out.printf("%.2f Quetzales son %.2f Dólares%n", quetzales, dolares);
    }

    public static void convertirDolaresAQuetzales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Dólares: ");
        double dolares = scanner.nextDouble();
        double quetzales = dolares * DOLLAR_TO_QUETZAL_RATE;
        System.out.printf("%.2f Dólares son %.2f Quetzales%n", dolares, quetzales);
    }

    public static void convertirQuetzalesAPesosMexicanos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Quetzales: ");
        double quetzales = scanner.nextDouble();
        double pesosMexicanos = quetzales * QUETZAL_TO_PESO_MXN_RATE;
        System.out.printf("%.2f Quetzales son %.2f Pesos Mexicanos%n", quetzales, pesosMexicanos);
    }

    public static void convertirPesosMexicanosAQuetzales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Pesos Mexicanos: ");
        double pesosMexicanos = scanner.nextDouble();
        double quetzales = pesosMexicanos * PESO_MXN_TO_QUETZAL_RATE;
        System.out.printf("%.2f Pesos Mexicanos son %.2f Quetzales%n", pesosMexicanos, quetzales);
    }
}
