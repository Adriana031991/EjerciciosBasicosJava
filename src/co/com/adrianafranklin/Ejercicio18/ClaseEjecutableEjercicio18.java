package co.com.adrianafranklin.Ejercicio18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClaseEjecutableEjercicio18 {
    public static void main(String[] args) {

        Serie serie = new Serie();

        Serie serieMayorTemporadas = new Serie();
        VideoJuego videoJuego = new VideoJuego();

        List<Serie> listaDeSeries = new ArrayList<>();

        Serie serie0 = new Serie();
        Serie serie1 = new Serie("Las olas de oceania", "Libertad");
        Serie serie2 = new Serie("Mermeladas de los politicos", 3, "Drama", "Jonathan");
        Serie serie3 = new Serie("Perencejita panda", "Luna Alejandra");
        Serie serie4 = new Serie("El camino de las hojas", 5, "fantasia", "Laura Sofia");

        listaDeSeries.add(serie0);
        listaDeSeries.add(serie1);
        listaDeSeries.add(serie2);
        listaDeSeries.add(serie3);
        listaDeSeries.add(serie4);
//"Las hijas de Dios", 2, "comedia", "Adriana"
        //"juego1",400
        VideoJuego listaDeVideoJuegos[] = new VideoJuego[5];
        listaDeVideoJuegos[0] = new VideoJuego();
        listaDeVideoJuegos[1] = new VideoJuego("Crahs", 20000, "aventura", "sony");
        listaDeVideoJuegos[2] = new VideoJuego("Popeye", 1500);
        listaDeVideoJuegos[3] = new VideoJuego("Zaboomafu", 2500);
        listaDeVideoJuegos[4] = new VideoJuego("Armada", 2500);

        serie3.entregado();
        listaDeVideoJuegos[4].entregado();
        serie1.entregado();
        serie4.entregado();
        listaDeVideoJuegos[2].entregado();
        listaDeVideoJuegos[0].entregado();


        int seriesEntregadas = 0;
        int videojuegosEntregadas = 0;

        serieMayorTemporadas = listaDeSeries.get(0);


        for (int i = 0; i < listaDeSeries.size(); i++) {
            Serie serieX = listaDeSeries.get(i);

            if (serieX.isEntregado()) {
                seriesEntregadas++;
                serieX.devolver();

            }

            if(i >0){
                int comparacion = serieX.compareTo(serieMayorTemporadas);

                if(comparacion==Constantes.MAYOR){
                    serieMayorTemporadas = serieX;
                }
            }
        }

        VideoJuego videoJuegoMayorHoras = listaDeVideoJuegos[0];

        for (int i = 0; i < listaDeVideoJuegos.length; i++) {
            VideoJuego videoJuegoX = listaDeVideoJuegos[i];

            if (videoJuegoX.isEntregado()) {
                videojuegosEntregadas++;
                videoJuegoX.devolver();
            }

            if(i >0){

                int comparacion = videoJuegoX.compareTo(videoJuegoMayorHoras);

                if(comparacion==Constantes.MAYOR){
                    videoJuegoMayorHoras = videoJuegoX;
                }
            }
        }


        System.out.println("Se entregaron: " + seriesEntregadas + " listaDeSeries \n");
        System.out.println("Se entregaron: " + videojuegosEntregadas + " videojuegos\n");

        System.out.println("El videojuego con más horas es: "+videoJuegoMayorHoras+"\n");
        System.out.println("La serie con más temporadas es: "+serieMayorTemporadas+"\n");



        //Arrays.stream(listaDeSeries).sorted((y,x)-> serie.compareTo(listaDeSeries)).forEach(System.out::print);
    }
}
