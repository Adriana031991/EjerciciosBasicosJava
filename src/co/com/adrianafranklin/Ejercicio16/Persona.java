package co.com.adrianafranklin.Ejercicio16;

public class Persona {

    //Atributos
    private String DNI;
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected int peso;
    protected float altura;

    //metodo constructor por defecto
    public Persona() {
        nombre = "Pedro";
        edad = 50;
        comprobarSexo();
        peso = 70;
        altura = (float) 1.80;
        DNI = generarDNI();
    }

    //Un constructorcon el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        DNI = generarDNI();
        this.peso = 50;
        this.altura = (float) 1.80;
    }

    //constructorcon todos los atributos como parámetro
    public Persona( String nombre, int edad, char sexo, int peso, float altura) {
        generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //metodo calcularIMC()

    public void calcularIMC() {

        float mts = altura*altura;
        float imc = peso/mts;
        final int bajoPesoIdeal = -1;
        final int pesoIdeal = 0;
        final int porEncimaDelPesoIdeal = 1;

        if (imc < 20){
            System.out.println(bajoPesoIdeal+" Tu indice de masa corporal es de: "+imc+"esta por debajo del peso ideal\n ");
            System.out.println();
        }

        if (imc == 20 && imc <= 25){
            System.out.println(pesoIdeal+" Tu indice de masa corporal es de: " + imc + "esta en el peso ideal\n ");
            System.out.println();
        }
        if (imc > 25){
            System.out.println(porEncimaDelPesoIdeal+ " Tu indice de masa corporal es de: "+imc+"esta por encima del peso ideal\n ");
            System.out.println() ;
        }

    }

    //metodo esMayorDeEdad

    public boolean esMayorDeEdad() {

        if (edad >= 18){
        System.out.println(nombre+" Es mayor de edad");
            return true;

        }
        else {

        System.out.println(nombre+" No es mayor de edad");
            return false;
        }

    }

    // metodo comprobarSexo(char sexo

    private void comprobarSexo() {

        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }
    }

    //metodo toString()

    @Override
    public String toString() {
        return " :: Persona ::" +
                "\nDNI=" + DNI +
                ",\n nombre='" + nombre + '\'' +
                ",\n edad=" + edad +
                ",\n sexo=" + sexo +
                ",\n peso=" + peso +
                ",\n altura=" + altura;
    }

    //metodo generaDNI

    private String generarDNI() {

        double num1;
        int num2;
        int dniRandom = 0;
        char letra;
        String Caracteres;
        String resultadoGenerarDNI;

        for (int i = 0; i < 8; i++) {
            num1 = Math.floor(Math.random() * (0 - 9) + 9);
            num2 = (int) num1;
            dniRandom = dniRandom * 10 + num2;
        }
        Caracteres = "TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo = dniRandom % 23;
        letra = Caracteres.charAt(modulo);
        resultadoGenerarDNI = ("" + dniRandom + letra + "");

        return resultadoGenerarDNI;

        /*DNI = "";
        int numAZ = 0;
        char letraDNI;
        for (int i = 0; i <8 ; i++) {
            numAZ = (int) ((Math.random() * (89 - 65)) + 65);
            letraDNI = (char) numAZ;
            DNI += letraDNI;
        }*/
    }

    //metodos set


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
