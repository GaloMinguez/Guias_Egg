package Main;

import Entidades.Electrodomestico;
import Entidades.Lavadora;


public class Main {

    public static void main(String[] args) {
        
        Electrodomestico electro = new Electrodomestico();
        electro.crearElectrodomestico(electro);
        
        electro.precioFinal();
        
        Double carga = 42.5;
        
        Lavadora lav = new Lavadora(electro, carga);
        lav.precioFinal();
        
        
        System.out.println(electro.toString());
        
        System.out.println(lav.toString());
        
    }
    
}
