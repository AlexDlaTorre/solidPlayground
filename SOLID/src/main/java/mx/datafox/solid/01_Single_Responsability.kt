package mx.datafox.solid

// 1. Single Responsibility - Responsabilidad única
// Cada clase debe un único propósito, y no saturarse con muchas funciones.

class Vehiculo(
    val llantas: Int,
    val velocidadMaxima: Int
) /*{
    fun imprimir() {
        println("llantas = $llantas, velocidadMaxima = $velocidadMaxima")
    }
}*/

/*fun main(){
    Vehiculo(6,200).imprimir()
}*/


fun main(){
    ImprimirVehiculo().imprimir(Vehiculo(4,200))
}

class ImprimirVehiculo {
    fun imprimir(vehiculo: Vehiculo) {
        println(
            "llantas = ${vehiculo.llantas}, " + "velocidadMaxima = ${vehiculo.velocidadMaxima}"
        )
    }
}