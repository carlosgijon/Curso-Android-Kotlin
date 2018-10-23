package secciontres

fun main(args: Array<String>) {
    println("=====================================================")
    println("=              Operaciones con numeros              =")
    println("=====================================================")
    println("Introduce 4 numeros, se sumarán los dos primeros y se")
    println("multiplicarán el 3 y el 4.")

    println("")

    println("Introduce el numero 1")
    val num1: Int = readLine()!!.toInt()

    println("Introduce el numero 2")
    val num2: Int = readLine()!!.toInt()

    println("Introduce el numero 3")
    val num3: Int = readLine()!!.toInt()

    println("Introduce el numero 4")
    val num4: Int = readLine()!!.toInt()

    println("")

    println("$num1 mas $num2 da " + (num1 + num2))
    println("$num3 por $num4 da " + (num3 * num4))
}