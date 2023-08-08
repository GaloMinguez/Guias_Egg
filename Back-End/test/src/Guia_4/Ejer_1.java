package Guia_4;

public class Ejer_1 {
    public static void main(String[] args) {
         int[] vector = new int [100];
         for (int i = 0; i < vector.length; i++){
             vector[i] = i+1;
             
         }
        for (int i = 99; i>=0; i--){
            System.out.println(vector[i] + " ");
        }
        
        
    }
    
    
}
