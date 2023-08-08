package CuentaBancariaServicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class CuentaBancariaServicio {

    CuentaBancaria valor = new CuentaBancaria();

    Scanner sc = new Scanner(System.in);

    public void ingresar(double dinero) {

        valor.setSaldoActual(valor.getSaldoActual() + dinero);

        JOptionPane.showMessageDialog(null, " su saldo actual es de " + valor.getSaldoActual());
        
    }
    
    
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public String consultarSaldo() {

        return "" + valor.getSaldoActual();
        
    }
    
    
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
//Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
//cuenta en 0.
    public void retirar(double retirar) {

        while (retirar > valor.getSaldoActual()) {

            JOptionPane.showMessageDialog(null,
                    "superaste el limite",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);

            String m = JOptionPane.showInputDialog(null, "ingresa una cantidad menor");

            retirar = Double.valueOf(m);

        }
        valor.setSaldoActual(valor.getSaldoActual() - retirar);
    }
    
    
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos() {

        System.out.println("su numero de identidad es " + valor.getDniCliente());

        System.out.println("su numero de cuneta es " + valor.getNumeroCuenta());

        System.out.println();
    }
    
    
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no
//saque más del 20%.
    public void extraccionRapida(double rapida) {

        while (rapida >= (valor.getSaldoActual() * 0.2)) {

            String restricto = JOptionPane.showInputDialog(null, "estas superando el limite permitido");

            rapida = Double.valueOf(restricto);

        }

        valor.setSaldoActual(valor.getSaldoActual() - rapida);

    }

}
