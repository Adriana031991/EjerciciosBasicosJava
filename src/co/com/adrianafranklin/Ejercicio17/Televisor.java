package co.com.adrianafranklin.Ejercicio17;

public class Televisor extends Electrodomestico{
    private int resolucionPantallaDef =20;
    private boolean sintonizadorTdtDef = false;


    private int resolucionPantalla;
    private boolean sintonizadorTDT;

    public Televisor(int resolucionPantalla, boolean sintonizadorTDT) {
        this.resolucionPantalla = resolucionPantallaDef;
        this.sintonizadorTDT = sintonizadorTdtDef;
    }

    public Televisor(float precioBase, float peso, int resolucionPantalla, boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucionPantalla = resolucionPantallaDef;
        this.sintonizadorTDT = sintonizadorTdtDef;
    }

    public Televisor(float precioBase, String color, Character consumoEnergetico, float peso, int resolucionPantalla, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucionPantalla = resolucionPantalla;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucionPantalla() {
        return resolucionPantalla;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double plus= super.precioFinal();

        if (resolucionPantalla>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT=true){
            plus+=50;

        }
        return plus;
    }
}
