package Persistencia;

import Entidades.Persona;

public class ControladoraPersistencia {

    PersonaJpaController PerJPA = new PersonaJpaController();

    
    public void crearPersona(Persona per){
        
        PerJPA.create(per);
        
    }
}
