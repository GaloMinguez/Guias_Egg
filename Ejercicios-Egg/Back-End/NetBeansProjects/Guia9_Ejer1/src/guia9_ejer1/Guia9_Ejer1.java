package guia9_ejer1;

public class Guia9_Ejer1 {

   
    public static void main(String[] args) {
        
        for (int i = 2; i <= 128; i*=2) {
            System.out.println("i "+ i);
        }
    }
    
}


//package cadenaapp1;
//
//import entidades.Cadena;
//import java.util.Scanner;
//import servicios.ServiciosCadena;
//
//
//public class CadenaApp1 {
//
//    
//    public static void main(String[] args) {
//        Scanner xd = new Scanner(System.in);
//        ServiciosCadena c1 = new ServiciosCadena();
//        Cadena cadena = c1.crear(xd);
//        c1.mostrarVocales(xd, cadena);
//        c1.invertirFrase(xd, cadena);
//        c1.letraRepetida(xd, cadena);
//        c1.compararLongitud(cadena);
//        c1.unirFrase( cadena);
//        c1.reemplazarLetra(cadena);
//        c1.contieneLetra(cadena);
//    }
//    
//}