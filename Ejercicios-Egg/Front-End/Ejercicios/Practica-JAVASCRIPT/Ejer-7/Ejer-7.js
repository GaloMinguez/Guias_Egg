let numLim = parseInt(prompt("Ingrese un valor limite para las sumas de la picina numerica"));
var suma = 0;
do {
    var num = parseInt(prompt("ingrese un numero para sumar a la picina numerica"));

    suma = suma + num;

} while (suma <= numLim);

console.log(numLim);
console.log(`la suma total es = ${suma}`)