function suma(a,b,c) {
    return a+b+c
}

class choche {
    //cosntructor
    constructor(){
        this.puertas = 4;
    }
    //metodos
    puertascoche(){
        return this.puertas;
    }
    sumarpuerta(){
        this.puertas++;
        console.log("   /Se agrego una puerta a mi coche.")
    }
    quitarpueta(){
        this.puertas--;
        console.log("   /Se quito una puerta a mi coche.")
    }
}

//uso
const micoche = new choche();
console.log("EJERCICIO 1:")
console.log("La suma de los parametros (8, 10 y 50) es = ",suma(8,10,50))
console.log("                   ")
console.log("EJERCICIO 2:")
console.log("cantidad de puertas originales del coche = "+ micoche.puertas)
micoche.sumarpuerta();
console.log("cantidad de puertas de mi coche ahora = "+ micoche.puertas)
console.log("                   ")
