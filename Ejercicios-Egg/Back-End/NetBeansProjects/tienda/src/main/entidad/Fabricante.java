
package main.entidad;


public class Fabricante {
   private String nombre;
   private Integer codigo;

    public Fabricante() {
    }
    
    public Fabricante(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Fabricante {" + " nombre =" + nombre + ", codigo =" + codigo + "}";
    }
   
   
   
}
