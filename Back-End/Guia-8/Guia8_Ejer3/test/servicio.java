
import Entiti.Persona;
import java.util.Scanner;

public class servicio {




    Scanner leer = new Scanner(System.in);
    
   public boolean esMayorDeEdad(Persona p1){
        return p1.getEdad() >= 18;
   }
   
    /*public boolean esMayorDeEdad(Persona p){
        boolean edads;
        
        
        if(p.getEdad() > 17){
            edads = true;
           
        }else{
            edads = false;
            
        }
         return edads;       
       
    }
*/
    public void  crearPersona(){
        Persona p = new Persona();
        
        System.out.println("Ingrese nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese edad de la persona");
        p.setEdad(leer.nextInt());
        System.out.print("Ingrese el sexo (H/M/O): ");
        char sexo = leer.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto. Intente nuevamente.");
            System.out.print("Ingrese el sexo (H/M/O): ");
            sexo = leer.nextLine().charAt(0);
        }
        p.setSexo(sexo);
        
        System.out.println("Ingrese el peso (en kg)" );
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura  (en mts)");
        p.setAltura(leer.nextDouble());
        return p;
    }
       public double calcularImc(){
       double Imc = p.getPeso()/(p.getAltura()*p.getAltura);
               //peso en kg/(altura^2 en mt2)
         if());  
           
           
           
       }
    
}
