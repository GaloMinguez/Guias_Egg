package Service;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class AhorcadoService {

    Scanner sc = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();
    int contJugadas = 0;
    int contador = 0;

    public void crearJuego() {
        String letra;
        System.out.println("Ingrese la palabra");
        String palabra = sc.next();
        System.out.println("la longitud de la palabra es " + longitud(palabra));

        String[] vector1 = new String[palabra.length()];

        System.out.println("Ingrese la cantidad de jugadas");
        ah.setCantJugadas(sc.nextInt());

        // el nuevo vector va alojar la palabra descompuesta
        for (int i = 0; i < longitud(palabra); i++) {
            vector1[i] = palabra.substring(i, i + 1);
        }
        ah.setPalabra(vector1);
        //NO PIDE IMPRESION PERO LO PUSE PARA VER QUE SALGA BIEN
//        System.out.println(Arrays.toString(ah.getPalabra()));

    }

    public int longitud(String palabra) {
        // el parametro del metodo es la palabra que ingrese en crear juego.
        return palabra.length();

    }

    public void buscar(String letra) {

        //int contador = 0; // cuenta los aciertos
        //do {
            contJugadas++;
            //System.out.println("Ingrese la letra ");
            //String letra = sc.next();

            // en vez del do/while se podria usar otro for hasta la cantidad de 
            // intentos.
            boolean bandera = false;

            for (int i = 0; i < ah.getPalabra().length; i++) {
                if (letra.equalsIgnoreCase(ah.getPalabra()[i])) {
                    bandera = true;
                    contador++;
                    ah.setCantLetras(contador);

                }
            }
            // el uso del boolean permite que pueda dar distintos mensajes segun
            //corresponda.
            // VER PORQUE UNA VEZ QUE ENTRA AL BANDERA TRUE NO SALE A PESAR QUE LETRA NO COINCIDE
            if (bandera == true) {
                System.out.println("La letra " + letra + "  pertenece a la palabra");
                encontradas(letra);
                //intentos(contJugadas);

            } else {
                System.out.println("La letra " + letra + " NO pertenece a  la palabra");
                encontradas(letra);
                intentos(contJugadas);
                
            }

            if (contador == ah.getPalabra().length) {
                System.out.println("Ha encontrado la palabra");
                //break;
            }
       // } while (ah.getCantJugadas() != contJugadas);

    }

    public void encontradas(String letra) {

        int restantes = ah.getPalabra().length - ah.getCantLetras();
        System.out.println("Numeros de letras encontradas = " + ah.getCantLetras() + " - faltan = " + restantes);

    }

    public void intentos(int contJugadas) {
        if ((ah.getCantJugadas() - contJugadas) == 0) {
            System.out.println("Lo sentimmos no tiene mas intentos");
        } else {
            System.out.println("ud. tiene " + (ah.getCantJugadas() - contJugadas) + " intentos restantes");
        }
    }

    public void juego() {
        crearJuego();
      do{
          System.out.println("Ingrese la letra ");
            String letra = sc.next();
            buscar(letra);
          if (contador == ah.getPalabra().length){
              break;
          }
      }while(ah.getCantJugadas() != contJugadas);
           

    }
}
