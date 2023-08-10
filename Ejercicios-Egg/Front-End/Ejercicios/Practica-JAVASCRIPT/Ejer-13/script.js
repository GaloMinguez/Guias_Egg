//Crear un objeto persona, con las propiedades 
//nombre, edad, sexo ('H' hombre, 'M' mujer,
//'O' otro), peso y altura. A continuación, 
//muestre las propiedades del objeto JavaScript.

function persona (nombre,edad,sexo,peso,altura) {
this.nombre = nombre,
this.edad = edad,
this.sexo = sexo,
this.peso = peso,
this.altura = altura
};

var persona1 = new persona('galo', 25, 'H', 80, 1.80);

console.log(persona1);
alert(persona1)

