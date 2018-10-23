package secciontres

fun main(args: Array<String>) {

    print("ingresa el primer numero")
    var numero1: Int = readLine()!!.toInt()

    print("ingresa el segundo numero")
    var numero2: Int = readLine()!!.toInt()

    val resultado = numero1 / numero2
    println("El resultado es $resultado")
}