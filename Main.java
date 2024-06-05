// Importar del nombrePaquete.nombreClase
import Lista.ListaDeCompras;
import Lista_opciones.ListaOpciones;
import interfaz_diseño.Banner;

import java.util.Scanner;

// Método Main
public class Main {

    public static void main(String[] args) {

        // Mostrar el mensaje del banner
        Banner.mensaje();

        // Cargar las opciones en la lista
        ListaOpciones.cargarOpciones();

        // Crear un escáner para la entrada del usuario
        Scanner inputOption = new Scanner(System.in);
        System.out.print("[?]: ");

        // Leer la opción del usuario
        int opcion = inputOption.nextInt();
        System.out.println("-----------------------------------");

        // Evaluar la opción ingresada y ejecutar la correspondiente acción
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
            case 6:
                ListaDeCompras.producto();
                break;

        }
}