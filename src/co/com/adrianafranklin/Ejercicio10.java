package co.com.adrianafranklin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio10 {
    public static void main(String[] args) {
        /**
         * Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
         */

        String mensajeInicial;
        String mensajeFinal;

        System.out.println("por favor introduzca una frase");

        Scanner sc = new Scanner(System.in);
        mensajeInicial = sc.nextLine();
        System.out.println(mensajeInicial);

        mensajeFinal = mensajeInicial.replaceAll("\\s+","");
        System.out.println(mensajeFinal);

        System.out.println("\n");
        otroEjemploParaQuitarEspacios();
    }

    public static void otroEjemploParaQuitarEspacios(){
        String ejemploA = "Hola Mundo las rosas son flores hermosas";
        Pattern a = Pattern.compile("[\\s]");
        Matcher b = a.matcher(ejemploA);

        String quitandoEspaciosDelEjemploA = b.replaceAll("");
        System.out.println(quitandoEspaciosDelEjemploA);

    }
}
