package co.com.adrianafranklin;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("---punto 7------");
/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while),
 * después muestra ese número por consola.
 */
        int x;

        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite numero"));
        } while (!(x >= 0));

        System.out.println("El numero que es ecribio es: "+x);
    }
}
