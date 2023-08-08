var num;
num = parseInt(prompt("ingrese el numero a verificar"));

var paridad = num%2
if(num >= 0){
    if(num == 0){
        alert("El numero ingresado no es PAR ni IMPAR es CERO")
    }else if (paridad == 1){
        alert("El numero ingresado es IMPAR");
    }else{
        alert("El numero ingresado es PAR");
    }
}else{
    alert("El numero ingresado es NEGATIVO")
}
