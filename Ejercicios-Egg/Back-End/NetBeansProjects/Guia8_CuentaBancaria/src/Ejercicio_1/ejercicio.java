//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes 
//atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor
//vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
//Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
//cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no
//saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
package ejercicio1;

import Entidades.CuentaBancaria;
import CuentaBancariaServicio.CuentaBancariaServicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CuentaBancaria cargardatos = new CuentaBancaria();
        CuentaBancariaServicio resultado = new CuentaBancariaServicio();

        boolean salir = true;

        do {

            Integer[] options = {1, 2, 3, 4, 5};
            int n = (Integer) JOptionPane.showInputDialog(null, " menu "
                    + "\n" + "1.ingresar "
                    + "\n" + "2.retirar "
                    + "\n" + "3.extraccion rapida"
                    + "\n" + "4.consultar saldo "
                    + "\n" + "5.salir ",
                     "cajero automatico", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            int selecion = n;

            switch (selecion) {
                case 1:

                    String m = JOptionPane.showInputDialog("ingrese dinero");

                    double resulte = Double.valueOf(m);

                    resultado.ingresar(resulte);

                    break;

                case 2:

                    String m2 = JOptionPane.showInputDialog("retiro de dinero" + "\n" + "salado actual :" + resultado.consultarSaldo() + "\n" + "CUANTO DESEA RETIRAR?");

                    double resulte2 = Double.valueOf(m2);

                    resultado.retirar(resulte2);

                    break;

                case 3:

                    String m3 = JOptionPane.showInputDialog("puede retirar solo el 20% de su sueldo");

                    double resulte3 = Double.valueOf(m3);

                    resultado.extraccionRapida(resulte3);

                    break;

                case 4:

                    System.out.println("---------- consultar saldo -------------");
                    JOptionPane.showMessageDialog(null, " su saldo es de :  " + resultado.consultarSaldo());

                    break;

                case 5:

                    System.out.println("---------- salir -------------");
                    salir = false;

                    break;

            }

        } while (salir == true);

    }

}
