package co.com.adrianafranklin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) {

        System.out.println("---punto 3------");
/**
 * Lee  un  número  por  teclado  que  pida  el  precio  de  un  producto  (puede  tener decimales) y calcule el precio final con IVA.
 * El IVA serauna constante que sera del 21%
 */
        double area;
        double radio;
        System.out.println("Por favor escribe un número");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(in);

        try {
            radio = r.read();
            area = Math.PI * Math.pow(radio, 2);
            System.out.println("el area del circulo es: " + area);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
