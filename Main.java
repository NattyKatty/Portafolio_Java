import calculadora.AritmeticaBasica;
import calculadora.CalcularEdad;
import conversor.ConversorGrados;
import conversor.Longitudes;
import conversor.Monedas;
import IMC.IMC;
import interfaz_grafica.Banner;
import lista.ListaDeCompras;
import mis_metodos.MisMetodos;
import mis_metodos.ListaOpciones;

import java.util.Scanner;

// Método Main
public class Main {

    public static void main(String[] args) {

        // Mostrar el mensaje del banner
        Banner.mensaje();

        // Crear un escáner para la entrada del usuario
        Scanner inputOption = new Scanner(System.in);
        System.out.print("[?]: ");

        // Leer la opción del usuario
        int opcion = inputOption.nextInt();
        System.out.println("-----------------------------------");


        switch (opcion) {
            case 1:
                System.out.println("Opcion_1");
                break;
            case 2:
                System.out.println("Opcion_2");
                break;
            case 3:
                System.out.println("Opcion_3");
                break;
            case 4:
                System.out.println("Opcion_4");
                break;
            case 5:
                System.out.println("Opcion_5");
                break;

            }
        }
    }

