package seccionocho

open class Humano() {

    private var palabra: String? = null

    fun saludo() {
        println("Hola a todos")
    }

    fun GetPalabra() : String? {
        return this.palabra
    }
}

class Perro() : Humano() {
    fun ladrido() {
        println("Guau, guau")
    }

    fun getPalabra() {
        super.GetPalabra()

    }
}

class Gato() {
    fun maullido() {
        println("Miauuuuuu")
    }
}

fun main(args: Array<String>) {

    var persona = Humano()
    var juanito = persona.saludo()

    var perrito = Perro()
    var coco = perrito.saludo()

    println(persona.GetPalabra())
}