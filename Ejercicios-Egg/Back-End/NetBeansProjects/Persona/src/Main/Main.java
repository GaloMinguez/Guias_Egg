package Main;

import Entidades.Persona;
import Persistencia.ControladoraPersistencia;


public class Main {

    
    public static void main(String[] args) {
        
        Persona per = new Persona(10, "GAlo", "Minguez", 40123123);
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearPersona(per);
        
        
    }
    
}
