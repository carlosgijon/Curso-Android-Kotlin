package seccionsiete

fun main(args: Array<String>) {

    val resultado: Int = sumar(3,9)

    println(resultado)

    val result = summa(5,8)
    println(result)

    val resulta = maxx(15,19)
    println(resulta)

}

fun sumar(a: Int, b: Int) : Int {
    return a + b
}

// Inline function
fun summa(a: Int, b: Int) : Int = a + b

fun maxim(num1: Int, num2: Int) : Int {
    if(num1 > num2) {
        return num1
    }
    else {
        return num2
    }
}

fun maxx(num1: Int, num2: Int) : Int = if (num1 > num2) num1 else num2