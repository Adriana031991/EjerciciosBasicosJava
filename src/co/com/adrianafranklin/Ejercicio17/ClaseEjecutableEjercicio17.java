package co.com.adrianafranklin.Ejercicio17;

public class ClaseEjecutableEjercicio17 {
    public static void main(String[] args) {

        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

        listaElectrodomesticos[0]= new Electrodomestico(600,"azul",'D',33);
        listaElectrodomesticos[1]= new Lavadora(205,20,19);
        listaElectrodomesticos[2]= new Electrodomestico(200,79);
        listaElectrodomesticos[3]= new Televisor(1590,"negro",'A',65,25,false);
        listaElectrodomesticos[4]= new Electrodomestico(15900,"rojo",'C',50);
        listaElectrodomesticos[5]= new Lavadora(190,41,19);
        listaElectrodomesticos[6]= new Electrodomestico(200,"verde",'R',61);
        listaElectrodomesticos[7]= new Televisor(658,"amarillo",'E',43,50,true);
        listaElectrodomesticos[8]= new Electrodomestico(754,30);
        listaElectrodomesticos[9]= new Televisor(350,30,32,false);


        float sumaElectrodomesticos =0;
        float sumaTelevisores =0;
        float sumaLavadoras =0;


        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Televisor){
                sumaTelevisores+=listaElectrodomesticos[i].precioFinal();
            }

        }
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de los televisores es de "+sumaTelevisores);



    }
}
