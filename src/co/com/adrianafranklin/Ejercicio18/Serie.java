package co.com.adrianafranklin.Ejercicio18;

import java.util.Collections;

public class Serie implements Entregable{

    //atributos

    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;


    public Serie() {
        this.numTemporadas = Constantes.numTemporadasDef;
        this.entregado = Constantes.entregadoDef;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.genero = "genero por defecto";
        this.creador = creador;
        this.numTemporadas = Constantes.numTemporadasDef;
        this.entregado = Constantes.entregadoDef;

    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    // get y set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    @Override
    public void entregado() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;

    }
    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }


    @Override
    public int compareTo(Object a) {
        Serie resultado = (Serie)a;
        if (this.numTemporadas> resultado.getNumTemporadas())
            return Constantes.MAYOR;
        if (this.numTemporadas == resultado.getNumTemporadas())
            return Constantes.IGUAL;
        return Constantes.MENOR;
    }

    //toString


    @Override
    public String toString() {
        return "-----:: Serie ::----" +
                ",\n titulo='" + titulo + '\'' +
                ",\n numTemporadas=" + numTemporadas +
                ",\n entregado=" + entregado +
                ",\n genero='" + genero + '\'' +
                ",\n creador='" + creador + '\'';
    }
}
