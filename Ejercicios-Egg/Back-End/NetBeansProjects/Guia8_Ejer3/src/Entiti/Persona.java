package Entiti;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    
    // Constructor por defecto
    public Persona() {
        
    }
    
    // Constructor con parámetros
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para calcular el índice de masa corporal
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    // Método para determinar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
                + altura + "]";
    }
}
