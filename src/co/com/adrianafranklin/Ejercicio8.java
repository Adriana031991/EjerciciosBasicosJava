package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /**
         * Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un díalaboral o no. Usa unswitchpara ello.
         */

        String diaDeLaSemana = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe un dia de la semana");
        diaDeLaSemana = sc.next().toLowerCase();

        switch (diaDeLaSemana) {
            case "lunes":
                System.out.println("El lunes es un dia laboral");
                break;
            case "martes":
                System.out.println("El martes es un dia laboral");
                break;
            case "miercoles":
                System.out.println("El miercoles es un dia laboral");
                break;
            case "jueves":
                System.out.println("El jueves es un dia laboral");
                break;
            case "viernes":
                System.out.println("El viernes es un dia laboral");
                break;
            case "sabado":
                System.out.println("El sabado no es un dia laboral");
                break;
            case "domingo":
                System.out.println("El domingo no es un dia laboral");
                break;
        }

    }

}
