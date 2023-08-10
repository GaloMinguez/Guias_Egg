
// Crear el objeto libro con las propiedades: 
// ISBN, Título, Autor,Número de páginas

alert("libro")

var msj;

function libro (ISBN,titulo,autor,paginas){
    this.ISBN = ISBN; 
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
}

var libreria = [];
do {
    var libro = new libro(
        ISBN = prompt("ingrese ISBN"),
        titulo = prompt("ingrese titulo"),
        autor = prompt("ingrese autor"),
        paginas = prompt("ingrese cantidad paginas")
    );

    libreria.push(libro)
    var msj = prompt("desea crear otro libro?");

} while (msj != "NO");


libreria.forEach(Element => {
   console.log(Element)
});


