package mx.datafox.solid

open class Animal {
    open fun caminar() { TODO() }
    // open fun saltar() { TODO() }
}

//fun saltarAgujero(animal: Animal) {
//    animal.saltar()
//    animal.caminar()
//    animal.saltar()
//}

//class Elefante: Animal() {
//    override fun saltar() = throw Exception("Los elefantes no pueden saltar")
//}

open class AnimalLigero: Animal() {
    open fun saltar() { TODO() }
}

class Perro: AnimalLigero()

class Elefante: Animal()

fun saltarAgujero(animal: AnimalLigero) {
    animal.saltar()
    animal.caminar()
    animal.saltar()
}