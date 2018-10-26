package seccionsiete

fun polimorfismo(num1: Int) : Unit {
    println("El número es $num1")
}

fun polimorfismo(num1: Double) : Unit {
    println("El número es $num1")
}

fun polimorfismo(num1: Float) : Unit {
    println("El número es $num1")
}

fun polimorfismo(num1: String) : Unit {
    println("El número es $num1")
}

fun main(args: Array<String>) {

    polimorfismo(91239)
    polimorfismo(123.654654)
    polimorfismo(12.345f)
    polimorfismo("Carlos")

}