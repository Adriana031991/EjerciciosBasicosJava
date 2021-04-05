package co.com.adrianafranklin.Ejercicio18;

public class VideoJuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String company;

    public VideoJuego() {
        this.horasEstimadas = Constantes.horasEstimadasDef;
        this.entregado = Constantes.entregadoDef;
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.horasEstimadas = Constantes.horasEstimadasDef;
        this.entregado = Constantes.entregadoDef;
        this.genero = "genero";
        this.company = "company";
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String company) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.company = company;
    }

    // get y set


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "----- :: VideoJuego ::-----" +
                ",\n titulo='" + titulo + '\'' +
                ",\n horasEstimadas=" + horasEstimadas +
                ",\n entregado=" + entregado +
                ",\n genero='" + genero + '\'' +
                ",\n company='" + company + '\'';
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
        VideoJuego resultado = (VideoJuego)a;
        if (this.horasEstimadas> resultado.getHorasEstimadas())
           return Constantes.MAYOR;
            // System.out.println("La cantidad de horas jugando es mayor");
        if (this.horasEstimadas == resultado.getHorasEstimadas())
            return Constantes.IGUAL;
            //System.out.println("la cantidad de horas jugando son iguales");
        return Constantes.MENOR;
    }
}
