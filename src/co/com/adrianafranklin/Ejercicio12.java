package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
         */

        String palabra1;
        String palabra2;

        Scanner sc = new Scanner(System.in);
        System.out.println("por favor escriba una palabra");
        palabra1 = sc.next();
        System.out.println("por favor escriba otra palabra");
        palabra2 = sc.next();

        if (palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("las palabras: "+ palabra1+ " y "+palabra2+ " No son iguales");
        }

    }
}
