package Perros;


public class Perro {
    
    private String nombre;
    private int energia;
    private int caminar;

    public Perro(String nombre, int energia, int caminar) {
        this.nombre = nombre;
        this.energia = energia;
        this.caminar = caminar;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEnergia() {
        return energia;
    }
   
    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCaminar() {
        return caminar;
    }
    public void setCaminar(int caminar) {
        this.caminar = caminar;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\nenergia=" + energia + "\ncaminar=" + caminar;
    }
    

   public void caminatita (){
        
        for (int i = 0; i < 5; i++) {
            
            
            
            
            
        }

   
    


   }
   
}


