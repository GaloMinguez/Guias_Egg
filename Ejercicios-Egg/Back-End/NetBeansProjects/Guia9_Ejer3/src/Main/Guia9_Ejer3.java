package Main;

import java.util.Arrays;
import Servicios.ArregloService;

public class Guia9_Ejer3 {
    
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloService servicio = new ArregloService();
        
        servicio.inicializarA(arregloA);
        System.out.println("El arreglo A sin ordenar seria: " + Arrays.toString(arregloA));
        
        servicio.ordenar(arregloA);
        System.out.println("El arreglo A ordenado seria: " + Arrays.toString(arregloA));
        
        servicio.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo A: "+ Arrays.toString(arregloA));
        System.out.println("Arreglo B: "+ Arrays.toString(arregloB));
        
        
    }
    
}
