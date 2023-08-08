const PI = Math.PI;
var radio;
var area;
var perimetro;

radio = prompt ("ingrese el radio para calcular el aréa y el perímetro");

area = PI * Math.pow(radio,2);

alert ("tu radio con math.pow es " + area);

area = PI * radio ** 2;
alert (`tu radio con doble asterisco es
${area}`);

perimetro = 2 * PI * radio;
alert (`tu perimetro es ${perimetro}`);
