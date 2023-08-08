package Entidades;


public class Persona {
    
    public String nombre;
    public int edad;
    public int DNI;

   
    //constructor con parametros
    public Persona(String persona, int edad, int DNI) {
        this.nombre = persona;
        this.edad = edad;
        this.DNI = DNI;
    }

    //constructor sin parametros
    public Persona() {
    }

    
    //GETTER sirve para obtener la informacion sin modificarla 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    //SETTER sirve para cargar nueva informacion 
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
    
}
