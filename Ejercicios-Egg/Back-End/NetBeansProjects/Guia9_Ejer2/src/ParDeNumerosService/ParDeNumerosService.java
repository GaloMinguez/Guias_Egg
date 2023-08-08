//Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:

//Método mostrarValores que muestra cuáles son los dos números guardados.
package ParDeNumerosService;

import Entidad.ParDeNumeros;

public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros num) {

        System.out.println("el primer numero es: " + num.getNum1());
        System.out.println("el segundo numero es: " + num.getNum2());
    }

    //Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public String devolverMayor(ParDeNumeros num) {
        String mayor;
        
//        double mayor = Math.max(num.getNum1(),num.getNum2() );

        if (num.getNum1() < num.getNum2()) {
            mayor = "El SEGUNDO numero es mayor que el PRIMERO";
        } else if (num.getNum1() == num.getNum2()) {
            mayor = "Los numeros son IGUALES";
        } else {
            mayor = "El PRIMER numero es mayor que el segundo";
        }
        return mayor;
    }

    //Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
    //Previamente se deben redondear ambos valores.
    public int calcularPotencia(ParDeNumeros num){
        int potencia;
        
        int num1 = (int) Math.round(num.getNum1());
        int num2 = (int) Math.round(num.getNum2());
        
        System.out.println(num1+ "\n"+ num2);
        if (num.getNum1() < num.getNum2()) {
            
            potencia = (int) Math.pow(num2,num1 );
            
        } else {
            potencia = (int) Math.pow(num1, num2);
            
        }
return potencia;
    }
    
    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
public double calcularRaiz(ParDeNumeros num){
    double raiz;
    
     if (num.getNum1() < num.getNum2()) {
        raiz= Math.sqrt(Math.abs(num.getNum1()));
         
        } else {
         raiz= Math.sqrt(Math.abs(num.getNum2()));
         
        }
    return raiz;
}
}
