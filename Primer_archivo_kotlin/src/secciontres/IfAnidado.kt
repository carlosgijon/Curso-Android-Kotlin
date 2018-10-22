package secciontres

fun main(args: Array<String>) {

    println("Ingresa la medida en metros")
    val medida : Double = readLine()!!.toDouble()

    if (medida >= 1.00) {
        if (medida > 5.00) {
            println("La medida $medida sobrepasa los límites aceptados")
        }
        else {
            println("La medida $medida es aceptable")
        }
    }
    else {
        println("No es aceptable")
    }
}