package Clases;


public class Rectangulo_7 {
    public int lado1;
    public int lado2;

    public Rectangulo_7() {
    }
    
    
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    
    public int calcularArea(){
       int Area = lado1*lado2;
        
        return Area;
    }
    
    
}
