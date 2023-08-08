package Clases;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;
    double aumentoSalario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularAumento() {
        if (edad > 30) {
            aumentoSalario = salario * 0.10 ;
            
        } else {
            aumentoSalario = salario * 0.05;
            
        }
        return aumentoSalario;
    }

}
