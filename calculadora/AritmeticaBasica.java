package calculadora;

import java.util.Scanner;

public class AritmeticaBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.printf("%-20s %s%n", "[1.] Sumar", "[2.] Restar");
        System.out.printf("%-20s %s%n", "[3.] Multiplicar", "[4.] Dividir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
