package seccionnueve

fun main(args: Array<String>) {

    try {
        println("Ingresa un numero")
        var num1 = readLine()!!.toInt()
        var division = 50 / num1

        println("La division es $division")
    }

    catch(e: Exception) {
        println("No se puede hacer división entre 0")
    }

    println("Aplicacion finalizada")
}