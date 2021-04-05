package co.com.adrianafranklin;

import java.util.Scanner;

public class Ejercicio15 {
    /**
     * Hacer un programa que muestre el siguiente menú de opciones
     * ****** GESTION CINEMATOGRÁFICA ********
     * 1-NUEVO ACTOR
     * 2-BUSCAR ACTOR
     * 3-ELIMINAR ACTOR
     * 4-MODIFICAR ACTOR
     * 5-VER TODOS LOS ACTORES
     * 6-VER PELICULAS DE LOS ACTORES
     * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
     * 8-SALIR
     * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8,
     * MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU
     * Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO".
     * Y MOSTRAR EL MENU NUEVAMENTE.PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
     */


    public static void main(String[] args) {

        int num1 = 0;
        do {

            System.out.println("\n****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("");
            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1. NUEVO ACTOR");
            System.out.println("2. BUSCAR ACTOR");
            System.out.println("3. ELIMINAR ACTOR");
            System.out.println("4. MODIFICAR ACTOR");
            System.out.println("5. VER TODOS LOS ACTORES");
            System.out.println("6. VER PELICULAS DE LOS ACTORES");
            System.out.println("7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8. SALIR");

            // Leer la respuesta del usuario
            int respuestaUsuario = validarLaRespuestadelMenu(0, 8);

            switch (respuestaUsuario) {

                case 1:
                    System.out.println("1. NUEVO ACTOR");
                    break;
                case 2:
                    System.out.println("2. BUSCAR ACTOR");
                    break;
                case 3:
                    System.out.println("3. ELIMINAR ACTOR");
                    break;
                case 4:
                    System.out.println("4. MODIFICAR ACTOR");
                    break;
                case 5:
                    System.out.println("5. VER TODOS LOS ACTORES");
                    break;
                case 6:
                    System.out.println("6. VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    System.out.println("7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    System.out.println("8. SALIR");
                    break;

                default:
                    System.out.println();
                    System.out.println("....¡¡¡Selecciona una opcion!!....");
                    System.out.println();
                    break;
            }

        } while (num1 != 0);

    }





    public static int validarLaRespuestadelMenu(int min, int max) {
        //Leer la respuesta del usuario
        Scanner sc = new Scanner(System.in);

        //Validar respuesta int
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("No ingresaste una opción valida!");
            System.out.println("Intenta otra vez!");
        }

        int respuesta = sc.nextInt();

        //Validar rango de respuesta
        while (respuesta < min || respuesta > max) {
            //Solicitar de nuevo la respuesta
            System.out.println("No ingresaste una opción valida!");
            System.out.println("Intenta otra vez");

            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("No ingresaste una opción valida!");
                System.out.println("Intenta otra vez");
            }
            respuesta = sc.nextInt();
        }
        System.out.println("Tu Respuesta fue: " + respuesta + "\n");
        return respuesta;

    }


}
