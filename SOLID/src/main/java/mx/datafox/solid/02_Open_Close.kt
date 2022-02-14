package mx.datafox.solid

// class Vehiculo2(tipoVehiculo: TipoVehiculo)

enum class TipoVehiculo {
    AUTO, MOTO
}

//fun dibujar(vehiculo: Vehiculo2) {
//    when(vehiculo.tipoVehiculo) {
//        TipoVehiculo.AUTO -> dibujar(vehiculo)
//        TipoVehiculo.MOTO -> dibujar(vehiculo)
//    }
//}

interface Vehiculo2 {
    fun dibujar()
}

fun dibujar(vehiculo2: Vehiculo2) {
    vehiculo2.dibujar()
}

class Auto: Vehiculo2 {
    override fun dibujar() {
        TODO("Not yet implemented")
    }
}

class Moto: Vehiculo2 {
    override fun dibujar() {
        TODO("Not yet implemented")
    }
}

class Camion: Vehiculo2 {
    override fun dibujar() {
        TODO("Not yet implemented")
    }
}


