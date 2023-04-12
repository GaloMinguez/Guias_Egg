package Guia_2.EXtras;


public class Extras_2 {
    public static void main(String[] args) {
        
        int A;
        int B;
        int C;
        int D;
        int aux;
        
        A = (int)(Math.random()*100+1);
        B = (int)(Math.random()*100+1);
        C = (int)(Math.random()*100+1);
        D = (int)(Math.random()*100+1);
        
        System.out.println("los valores INICIALES de cada variable son" + "\n A= " + A + "\n B= " + B + "\n C= " + C + "\n D= " + D);
        
       aux=B;
       B=C;
       C=A;
       A=D;
       D=aux;
       
       System.out.println("los valores FINALES de cada variable son" + "\n A= " + A + "\n B= " + B + "\n C= " + C + "\n D= " + D);
       
       
        
    }
}
