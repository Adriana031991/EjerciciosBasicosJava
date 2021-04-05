package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /**
         * Del texto, “La sonrisa serala mejor arma contra la tristeza”Reemplaza  todas lasadel  String  anterior  por  una e,
         * adicionalmente  concatenar  a  esta  frase  una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("por favor escribe una frase");

        String parrafoDado = "La sonrisa sera la mejor arma contra la tristeza";

        String parrafoModificado = parrafoDado.replaceAll("a", "e").concat(" "+ sc.nextLine());

        System.out.println(parrafoModificado);




    }
}
