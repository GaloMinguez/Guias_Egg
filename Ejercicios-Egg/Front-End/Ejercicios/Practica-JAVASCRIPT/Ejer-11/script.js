//Escribir una función que reciba un String y devuelva la palabra más larga.
//String Ejemplo: “Guia de JavaScript”
//Resultado esperado : “JavaScript”

var frase = prompt("ingrese una frase");

var array = frase.split(" ")

var max = "";
array.forEach(element => {

    if (max.length < element.length) {
        max = element;
    }
    
});

console.log(array)
console.log(max)