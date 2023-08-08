package guia_5;

import Clases.Operaciones;
import java.util.Scanner;

public class Ejer_3 {

    public class Application {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Operaciones operacion = new Operaciones();
            operacion.crearOperacion(0, 0, sc);
            System.out.println("la suma de los numeros es " + operacion.sumar());
            System.out.println("la resta de los numeros es " + operacion.restar());
            System.out.println("la multiplicacion de los numeros es " + operacion.multiplicar());
            System.out.println("la dividir de los numeros es " + operacion.dividir());
            sc.close();

        }
    }

}
