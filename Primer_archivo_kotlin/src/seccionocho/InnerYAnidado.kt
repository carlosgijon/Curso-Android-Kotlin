package seccionocho

class Externa {

    private val nombre: String? = null

    inner class Anidada {

        fun mostrar() {
            println(nombre)
        }

    }
}

fun main(args: Array<String>) {
    var externa = Externa()
    var anidada = Externa.Anidada()

    anidada.mostrar()
}