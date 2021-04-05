package co.com.adrianafranklin.Ejercicio17;

public class Lavadora extends Electrodomestico {
    private final float cargaDef =5;

    private float carga;

    public Lavadora(float carga) {
        this.carga = carga;
    }

    public Lavadora(float precioBase, float peso, float carga) {
        super(precioBase, peso);
        this.carga = cargaDef;
    }

    public Lavadora(float precioBase, String color, Character consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double plus= super.precioFinal();

        if (carga>30){
            plus+=50;
        }
        return plus;
    }
}
