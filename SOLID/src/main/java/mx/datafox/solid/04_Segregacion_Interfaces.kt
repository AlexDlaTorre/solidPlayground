package mx.datafox.solid

import java.lang.UnsupportedOperationException

interface Producto {
    val nombre: String
    val existencia: Int
    val numeroDeDiscos: Int
    val fechaLiberacion: Int
    // val edadRecomendada: Int
}

class CD(
    override val nombre: String,
    override val existencia: Int,
    override val numeroDeDiscos: Int,
    override val fechaLiberacion: Int
) : Producto {
    // ...
//    override val edadRecomendada: Int
//        get() = throw UnsupportedOperationException()
}

//interface DVD: Producto {
//    val edadRecomendada: Int
//}

interface VerificarEdad {
    val edadRecomendada: Int
}

class DVD(
    override val nombre: String,
    override val existencia: Int,
    override val numeroDeDiscos: Int,
    override val fechaLiberacion: Int,
    override val edadRecomendada: Int
) : Producto, VerificarEdad {
    // ...
}

class Usuario(
    val edad: Int
)

fun verificarSiUsuarioPuedeComprar(usuario: Usuario, verificarEdad: VerificarEdad) = usuario.edad >= verificarEdad.edadRecomendada