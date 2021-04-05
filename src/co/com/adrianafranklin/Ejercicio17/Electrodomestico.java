package co.com.adrianafranklin.Ejercicio17;

public class Electrodomestico {
    //constantes
    protected final float precioBaseDef = 100;
    protected final String colorDef = "blanco";
    protected final Character consumoEnergeticoDef = 'F';
    protected final float pesoDef = 5;

    //atributos
    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;



    //metodos constructores

    //por defecto
    public Electrodomestico(){
        this.precioBase = precioBaseDef;
        this.peso = pesoDef;
        this.consumoEnergetico = consumoEnergeticoDef;
        this.color = colorDef;
    }

    //con dos parametros
    public Electrodomestico(float precioBase, float peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergeticoDef;
        this.color = colorDef;


    }

    //con todos los parametros
    public Electrodomestico(float precioBase, String color, Character consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        comprobarColor();
        comprobarConsumoEnergetico();
        this.peso = peso;
    }

    //metodos get

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    //comprobar consumo energetico

    public void comprobarConsumoEnergetico(){

        char letraConsumoEnergetico[] = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};

        if (!letraConsumoEnergetico.equals(letraConsumoEnergetico)){
            this.consumoEnergetico = consumoEnergeticoDef;
        } else {
            this.consumoEnergetico = consumoEnergetico;
        }

    }

    //metodo comprobar color

    private void comprobarColor() {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorSelecionado=false;

        for (int i = 0; i < colores.length ; i++) {
            if (colores[i].equals(color)){
                colorSelecionado=true;
            }
        }
        if (colorSelecionado){
            this.color=color;
        }else {
            this.color=colorDef;
        }

    }

    //metodo precio final

    public double precioFinal(){
        float plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }

        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }

        return precioBase+plus;
    }

}
