package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /**
         * Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
         */

        int num1;
        int contador = 0;

        System.out.println("Por favor escribe un numero");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        for (int i = num1; i <= 1000 ; i+=2) {
            System.out.println("\n"+i);
            contador++;
        }

    }
}
