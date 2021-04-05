package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("---punto 4------");
        double a;
        final double iva = 0.21;
        double pp;
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor coloca el precio del producto");
        a = sc.nextDouble();
        System.out.println("el precio del producto es: $" + a);
        pp = (a * iva) + a;
        System.out.println("el precio publico es: $" + pp);

    }

}

