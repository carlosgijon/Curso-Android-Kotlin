package seccionocho

open class Human() {

    var palabra: String? = null

    open fun saludo() {
        println("Hola a todos")
    }

    fun GetPalabra() : String? {
        return this.palabra
    }
}

class Perr() : Human() {
    fun ladrido() {
        println("Guau, guau")
    }

    override fun saludo() {
        println("Soy un perro, Hola a todos")
    }

    fun getPalabra() {
        super.GetPalabra()

    }
}

fun main(args: Array<String>) {

    var persona = Human()
    var juanito = persona.saludo()

    var perrito = Perr()
    var coco = perrito.saludo()
}