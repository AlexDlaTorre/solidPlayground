package mx.datafox.solid

class Compras {
    //...
}
//
//class CarritoCompras {
//    fun compra(compras: Compras?) {
//        val db = SQLDatabase()
//        db.guardar(compras)
//
//        val tarjetaCredito = TarjetaCredito()
//        tarjetaCredito.pagar(compras)
//    }
//}
//
//class SQLDatabase {
//    fun guardar(compras: Compras?) {
//        // Guardar en la base de datos SQL
//    }
//}
//
//class TarjetaCredito {
//    fun pagar(compras: Compras?) {
//        // Realizar cobro usando una tarjeta de crédito
//    }
//}

interface Persistencia {
    fun guardar(compras: Compras?)
}

class SQLDatabase: Persistencia {
    override fun guardar(compras: Compras?) {
        // Guarda los datos en la base de datos SQL
    }
}

interface MetodoPago {
    fun pagar(compras: Compras?)
}

class TarjetaCredito: MetodoPago {
    override fun pagar(compras: Compras?) {
        // Realiza el cobro usando tarjeta de crédito
    }
}

class CarritoCompras(
    private val persistencia: Persistencia,
    private val metodoPago: MetodoPago
) {
    fun comprar(compras: Compras?) {
        persistencia.guardar(compras)
        metodoPago.pagar(compras)
    }
}

class Servidor: Persistencia {
    override fun guardar(compras: Compras?) {
        // Guarda los datos en un servidor
    }
}

class PayPal: MetodoPago {
    override fun pagar(compras: Compras?) {
        TODO("Not yet implemented")
    }
}

