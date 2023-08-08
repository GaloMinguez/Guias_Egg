package guia9_ejer2;

import Entidad.ParDeNumeros;
import ParDeNumerosService.ParDeNumerosService;


public class Guia9_Ejer2 {


    public static void main(String[] args) {
        
        ParDeNumeros nm = new ParDeNumeros();
        ParDeNumerosService nms = new ParDeNumerosService();
        
        
        
        nms.mostrarValores(nm);
        
        String mayor = nms.devolverMayor(nm);
        System.out.println(mayor);
        
        int potencia = nms.calcularPotencia(nm);
        System.out.println("La potencia es : " + potencia);
        
        double raiz = nms.calcularRaiz(nm);
        System.out.println("La raiz es : " + raiz);
        
    }

    
}
