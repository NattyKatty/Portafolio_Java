package Lista;
import Lista_opciones.ListaOpciones;

import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    public static String[] opciones6={"lista de compras","salir"};


    public static void prograrma(){

        ListaOpciones.cargarOpciones(opciones6);

        Scanner opcion=new Scanner( System.in );
        int r = opcion.nextInt();

        switch (r){
            case 1:
                crearLista();
                break;
            case 2:

        }

    }
    

}