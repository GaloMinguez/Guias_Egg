package Clases;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
    
    

    public void retirarDinero() {

        System.out.println("ingrese el monto que desea retirar");
        double retirarDinero = leer.nextInt();

        if (retirarDinero > saldo) {
            System.out.println("el dinero disponible no es suficiente");

        } else {
            System.out.println("se retiro el dinero exitosamente");
            saldo -= retirarDinero;
            System.out.println("su nuevo saldo es = " + saldo);
        }

    }

}
