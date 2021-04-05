package co.com.adrianafranklin;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("--punto 2-------");

        int x = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite numero: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite otro numero: "));

        if (x > y) {
            System.out.println("x es mayor que y");
        } else if (x == y) {
            System.out.println("x es igual a y");
        } else {
            System.out.println("x es menor que y");
        }
    }
}
