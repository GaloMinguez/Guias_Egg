var palabra = prompt("ingrese una palabra o frase");

var array = palabra.split("")

array = array.reverse()

palabra = array.join("")

console.log(palabra)