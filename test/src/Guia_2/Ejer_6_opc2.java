package Guia_2;

import java.util.Scanner;


public class Ejer_6_opc2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrse dos números positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean selec = false;
        
        do{
            System.out.print("\nMENU\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija una opción\n");
            int opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    int suma = num1 + num2;
                    System.out.print(suma);
                    break;
                    
                case 2:
                    int resta = num1 - num2;
                    System.out.print(resta);
                    break;
                    
                case 3:
                    int mult = num1 * num2;
                    System.out.print(mult);
                    break;
                    
                case 4:
                    int div = num1 / num2;
                    System.out.print(div);
                    break;
                    
                case 5:
                    System.out.print("¿Está seguro que desea sair del programa?\nY/N\n");
                    String sel = leer.next();
                    if (sel.equals("Y") || sel.equals("y")){
                        selec = true;
                    }
                default:
                    System.out.print("Saliendo del sistema");
                    
            }
            
        }while(!selec);
        
     }
      
}
    
    
  