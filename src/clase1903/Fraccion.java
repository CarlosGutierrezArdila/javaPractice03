package clase1903;

public class Fraccion {
    private int numerador;
    private int denominador;


    public Fraccion() {
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador= 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //suma
    public Fraccion sumar(Fraccion a){
        return new Fraccion(numerador= a.getNumerador() * this.getDenominador() + this.getNumerador() * a.getDenominador(), denominador=a.getDenominador() * this.getDenominador());
    }
    //resta
    public Fraccion resta(Fraccion a){
        return new Fraccion(this.getNumerador()*a.getDenominador()-a.getNumerador()*this.getDenominador(),a.getDenominador()*this.getDenominador());
    }
    //mult
    public Fraccion multiplicar(Fraccion a ){
        return new Fraccion(a.getNumerador()*this.getNumerador(), a.getDenominador()*this.getDenominador() );
    }
    //div
    public Fraccion dividir(Fraccion a) {
        return new Fraccion(a.getNumerador()*this.getDenominador(), a.getDenominador()*this.getNumerador());
    }



    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
