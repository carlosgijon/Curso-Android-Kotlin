package seccioncuatro

fun main(args: Array<String>) {
    println("Ingresa el primer numero: ")
    val num1 : Int = readLine()!!.toInt()

    println("Ingresa el segundo numero: ")
    val num2 : Int = readLine()!!.toInt()

    val suma : Int = num1 + num2
    val resta : Int = num1 + num2
    val multiplicacion : Int = num1 * num2
    val division : Double = num1.toDouble() / num2.toDouble()

    if (num1 > num2) {
        println("numero 1 ($num1) es mayor que numero 2 ($num2)")
        println("suma: $suma")
        println("resta: $resta")
    }
    else {
        println("numero 2 ($num2) es mayor que numero 1 ($num1)")
        println("multiplicacion: $multiplicacion")
        println("división: $division")
    }
}