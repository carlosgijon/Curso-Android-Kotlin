package seccionuno

fun main(args: Array<String>) {


    var num1 : Int = 5
    var num2 : Int = 10
    var string_numero : String = "19"

    num1 = string_numero.toInt()  // Se usa el metodo toInt() para convertir de String a Int

    println(num1)

    var num3 : Float? = 12.5f // Se puede dejar sin inicializar

    num3 = num2.toFloat()

    println("$num3 es un " + num3.javaClass.kotlin.qualifiedName)  // Sirve para sacar el tipo de dato

    var doble : Double

    doble = num2.toDouble()
    println("$doble es un " + doble.javaClass.kotlin.qualifiedName)

    string_numero = doble.toString()
    println(string_numero + " es un " + string_numero.javaClass.kotlin.qualifiedName)

}