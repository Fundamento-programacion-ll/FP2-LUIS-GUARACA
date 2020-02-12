var arreglo = [1, 2, 3, 4, 5];
console.log(arreglo.length);
arreglo.push(6); //ingresa elemento en la ultima posicion
//arreglo.pop(); //elimina el ultimo elemento 
for (let index = 0; index < arreglo.length; index++) {
    var element = arreglo[index];
    console.log(element);
}
console.log(arreglo.length);
arreglo.pop();
console.log(arreglo[3]); 
console.log(arreglo.slice(2, 4));
console.log(arreglo.shift()); 
console.log(arreglo.unshift()); 
console.log(arreglo.reverse());
var arregloString = 'anthony';
var arreglopalabra = arregloString.split('');
console.log(arreglopalabra.reverse());
console.log(arreglo);
var arreglodividido = arreglo.slice(2, 4);
console.log(arreglodividido);
arreglo.splice(0, 1);
console.log(arreglo);


console.log('Foreach');
           
arreglo.forEach((elemnto, indice) => {
    console.log(elemnto, indice);
});
var arreglomutado = arreglo.map((e, i) => {

    return e + 1;
}).forEach((el, indice) => {
    console.log(el, indice);
});

console.log(arreglomutado);
var arrgls = arreglo.some((e, i) => {
    return e == 2;
});
console.log(arrgls);
/**var arreglo2 = arreglo.forEach(e => {
return e * 2;
})
.some(e => {
    return e % 2 == 0;
});
console.log(arreglo2);**/
var arreglonuevo = arreglo.find((e, i) => {
    return e === 2;
});
console.log(arreglonuevo);

var arreglojson = [{
    nombre: 'a',
    eda: 10
}, {

}]
var instanciareventouno = eventouno();
instanciareventouno.on('saludar',(respuesta)=>{

    console.log('hola');

    
});





//class enventoUno {}

