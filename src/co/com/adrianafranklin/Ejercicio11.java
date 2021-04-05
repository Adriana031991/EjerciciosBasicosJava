package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /**
         * Realizar  la  construcción  de  un  algoritmo  que  permita  de  acuerdo  a  una  frase pasada  por  consola,
         * indicar  cual  es  la  longitud  de  esta  frase,  adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
         */

        String mensajeInicialEjercicio11;
        int contador = 0;

        System.out.println("por favor introduzca una frase");

        Scanner sc = new Scanner(System.in);
        mensajeInicialEjercicio11 = sc.nextLine().toLowerCase();

        int length = mensajeInicialEjercicio11.length();

        System.out.println("la longitud de la frase " + mensajeInicialEjercicio11 + " es: " + length);

        indicarCuantasVocalesTieneLaFrase(mensajeInicialEjercicio11, contador);


        indicarLasVocalesDeLaFrase(mensajeInicialEjercicio11);
    }

    private static void indicarCuantasVocalesTieneLaFrase(String mensajeInicialEjercicio11, int contador) {
        for (int i = 0; i < mensajeInicialEjercicio11.length(); i++) {
            if ((mensajeInicialEjercicio11.charAt(i) == 'a') || (mensajeInicialEjercicio11.charAt(i) == 'e') || (mensajeInicialEjercicio11.charAt(i) == 'i')
                    || (mensajeInicialEjercicio11.charAt(i) == 'o') || (mensajeInicialEjercicio11.charAt(i) == 'u'))
                contador++;
        }

        System.out.println("\nla frase " + mensajeInicialEjercicio11 + " tiene " + contador + " vocales");
    }

    private static void indicarLasVocalesDeLaFrase(String mensajeInicialEjercicio11) {
        int[] vocales = new int[5];
        char caracter;

        for (int i = 0; i < mensajeInicialEjercicio11.length(); i++) {
            caracter = new Character(mensajeInicialEjercicio11.charAt(i));

            switch (caracter) {
                case 'a':
                    vocales[0]++;
                case 'e':
                    vocales[1]++;
                case 'i':
                    vocales[2]++;
                case 'o':
                    vocales[3]++;
                case 'u':
                    vocales[4]++;

            }
        }
        System.out.println("la frase tiene las siguientes vocales:\n"+
                        "vocal \t N°veces\n"+
                        "a\t\t"+vocales[0]+ "\n"+
                        "e\t\t"+vocales[1]+ "\n"+
                        "i\t\t"+vocales[2]+ "\n"+
                        "o\t\t"+vocales[3]+ "\n"+
                        "u\t\t"+vocales[4]+ "\n"
                );
    }
}


