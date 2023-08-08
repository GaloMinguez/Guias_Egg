alert ("el final del ingreso de numeros sera el CERO")

var num = parseInt(prompt("ingrese el primer NUMERO AQUI"));
var max=num,min=num,prom=num;
var cont = 1;

while(num != 0){
    
    var num = parseInt(prompt("siga ingresando NUMEROS"));
    if (num != 0){
    if(max<num){
        max=num;
    }
    if(min>num){
        min=num;
    }
    cont ++;
    prom += num;
    }
}
prom = prom/cont;

console.log(`El numero maximo ingresado es = ${max}`);
console.log(`El numero minimo ingresado es = ${min}`);
console.log(`El promedio de numeros ingresado es = ${prom}`);