var lista = [1,2,3,4,5,6,5,"a",2,"b",{}, [] , null,undefined]
//for (let i = 0; i < array.length; i++) {
//for ( var list in lista){    console.log(list)}
var mifuncion = () => {}
lista.forEach( (element) => {
    console.log(element)});
var lista2 = [1,2,3,4,5,6,7,8,9,10]
    // [1,1,3,2,5,3,7,4,9,5]
var lista3 = lista2.map((element)=>{
    if (element % 2 === 0) {
        return element/2;
        }
        return element;
    });
console.log(lista3);

var lista1 = [], lista2 = [];

for(let i = 0; i < 50; i++){
    lista1.push(Math.floor(Math.random() * 100));
}

console.log(lista1.sort((a,b) => {
    return a-b
}))

////////////////////////////////////////////////////////////
var lista1 = [], lista2 = [];
for (let i = 0; i < 50; i++) {
    lista1.push((Math.random() * 100));
        if (i<20){
            lista2.push(Math.random() * 100);
        }
}
console.log(lista1)
lista1.sort((a,b) => {
        return a-b
        }
)
for (let i = 0; i < 20; i++) {
    if (i<10){
        lista2[i] = (lista1[i])    
    }else{
        lista2[i]=(0.5)
    }
}
console.log(lista1)
console.log(lista2)






































