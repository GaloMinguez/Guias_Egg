package Entidad;

import java.util.Date;


public class Persona {
    
    private String nombre;
    private Date fechaDeNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNac) {
        this.nombre = nombre;
        this.fechaDeNac = fechaDeNac;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaDeNac() {
        return fechaDeNac;
    }
    public void setFechaDeNac(Date fechaDeNac) {
        this.fechaDeNac = fechaDeNac;
    }
    
    
    
    
    
}
