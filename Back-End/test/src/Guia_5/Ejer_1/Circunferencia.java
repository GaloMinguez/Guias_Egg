package Guia_5.Ejer_1;


public class Circunferencia {
    
    private double radio;

    // A)
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public Circunferencia() {
    }
    
    // B)
    public double getRadio() {
        return radio;
    }
    // B)
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // D)
    public double area(){
        return Math.pow(radio,2)*Math.PI;
    }
    
    // E)
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}

