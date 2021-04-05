package co.com.adrianafranklin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio13 {

    public static void main(String[] args) {
        /**
         * Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
         */

        System.out.println("\nLa fecha y hora actual es:\n ");
        fechaYhoraActual();




    }

    private static void fechaYhoraActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        Date fecha = new Date();

        //System.out.println("\n");
        System.out.println(formatoFecha.format(fecha));
        System.out.println(formatoHora.format(fecha));
    }


}
