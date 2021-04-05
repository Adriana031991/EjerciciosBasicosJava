package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("---punto 5------");
/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("El numero: " + i + " es par");
            } else
                System.out.println("El numero: " + i + " es impar");
            i++;
        }

    }


}
