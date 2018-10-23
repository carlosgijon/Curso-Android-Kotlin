package seccioncinco

fun main(args: Array<String>) {

    val numeros : IntRange = 1..400

    for (elementos in numeros) {
        if(elementos % 8 == 0) {
            println(elementos)
        }
    }
}