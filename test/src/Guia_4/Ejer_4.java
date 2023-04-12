package Guia_4;

public class Ejer_4 {
    public static void main(String[] args) {
        
          int[][] matriz = new int[4][4];
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
    
            matriz[i][j] = (int)(Math.random()*10+1);
            
            }
        }
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }
        System.out.println("TRASPUESTA");
    
    for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {

                
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }
    
    
    
    
    
    }
}
