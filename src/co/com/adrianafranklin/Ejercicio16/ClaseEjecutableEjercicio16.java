package co.com.adrianafranklin.Ejercicio16;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ClaseEjecutableEjercicio16 {
    public static void main(String[] args) {


        Persona persona = new Persona();

        //solicita datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre ");
        persona.nombre = sc.next();
        System.out.print("Introduce la edad de "+persona.nombre+" ");
        persona.edad= sc.nextInt();
        System.out.print("Selecciones sexo: H / M ");
        persona.sexo = sc.next().charAt(0);

        System.out.print("Introduce el peso de "+persona.nombre+ " en Kg: ");
        persona.peso = sc.nextInt();
        System.out.print("Introduce la altura de "+persona.nombre+ " en Mts: ");
        persona.altura= sc.nextFloat();

        //crea tres objetos
        System.out.println("\n--------1era Persona");
        Persona persona1 = new Persona(persona.nombre, persona.edad, persona.sexo, persona.peso, persona.altura);
        System.out.println(persona1);
        persona1.calcularIMC();
        persona1.esMayorDeEdad();


        System.out.println("\n--------2da Persona");
        Persona persona2 = new Persona(persona.nombre, persona.edad, persona.sexo);
        System.out.println(persona2);
        persona2.calcularIMC();
        persona2.esMayorDeEdad();


        System.out.println("\n--------3era Persona");
        Persona persona3 = new Persona();
        persona3.setNombre("Manuelito");
        persona3.setEdad(28);
        persona3.setSexo('H');
        persona3.setPeso(60);
        persona3.setAltura((float) 1.74);

        System.out.println(persona3);
        persona3.calcularIMC();
        persona3.esMayorDeEdad();



    }

}
