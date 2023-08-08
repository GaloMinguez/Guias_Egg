var opcion;
var num1, num2, resul;

opcion = prompt ("que operacion desea ralizar? (Suma, Resta, Multiplicacion, Division)");
num1 = parseInt(prompt ("Ingrese el primer numero para operar"));
num2 = parseInt(prompt ("Ingrese el segundo numero para operar"));


switch(opcion){
    case'S':
        resul = num1 + num2;
        alert ("El resultado de la suma es: " + resul);
    break;
    case'R':
        resul = num1 - num2;
        alert ("El resultado de la resta es: " + resul);
    break;
    case'M':
        resul = num1 * num2;
        alert ("El resultado de la Multiplicacion es: " + resul);
    break;
    case'D':
        resul = num1 / num2;
        alert ("El resultado de la Division es: " + resul);
    break;
    default:
        alert("que tas queriendo hacer LOCO");
}