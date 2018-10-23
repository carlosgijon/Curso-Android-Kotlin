package seccioncuatro

fun main(args: Array<String>) {
    val x = 16

    when (x) {

        1 -> {
            println("El valor es 1")
        }

        2 -> println("El valor es 2")
        3 -> println("El valor es 3")
        in 5..15 -> println("El valor esta entre 5 y 15")
        !in 5..15 -> println("El valor no esta entre 5 y 15")
        else -> println("El valor esta fuera de rango")
    }

    val promedio = 10

    // WHEN COMO EXPRESION

    val resultado = when(promedio) {
        10 -> "Tu resultado es sobresaliente, tienes un $promedio"
        9 -> "Tu resultado es bueno, tienes un $promedio"
        in 6..8 -> "Tu resultado es suficiente, tienes un $promedio"
        // si hicieramos 6,8 sería o 6 o 8 pero no 7
        else -> "Tu resultado es insuficiente, tienes un $promedio"
    }

    println(resultado)
}