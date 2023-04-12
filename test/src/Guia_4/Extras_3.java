package Guia_4;


public class Extras_3 {
    public static void main(String[] args) {
        
        int vector[] = new int[5];
        
        rellenarVector(vector);
        mostrarVector(vector);
        
    }
    
    
    public static void rellenarVector(int[]vector){
        
         for (int i = 0; i < 5; i++) {
                vector[i] =(int) (Math.random()*50+1);
         }
    }
    
   public static void mostrarVector(int[]vector){
       
       for (int i = 0; i < 5; i++) {
            
            System.out.print("[" + vector[i] + "]");
            
        }
        System.out.println(" ");
        
    }
    
}
