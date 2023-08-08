package Extras;

import Clases.Cuenta;
import java.util.Scanner;

public class Extras_5 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //  int[] cuentas = new int[5];
        Cuenta cuenta1 = new Cuenta();
        
         
        //String cuenta;
        //boolean B = false;
       
        
        
        /*do {
            System.out.println("ingrese su cuenta");
            cuenta=leer.next();
            if(cuenta==cuenta1){
                
            }
            System.out.println("desea salir?");
            
        } while (B != false);*/
        
        cuenta1.setTitular("Galo Minguez");
        cuenta1.setSaldo(100000);
        
        cuenta1.toString();
        
        
        

        cuenta1.retirarDinero();

    }

}
