package secciontres

fun main(args: Array<String>) {

    println("¿Que nota obtuvo en variables?")
    val caliVariables : Int = readLine()!!.toInt()

    println("¿Que nota obtuvo en operaciones matematicas?")
    val caliOperacionMatematica : Int = readLine()!!.toInt()

    println("¿Que nota obtuvo en operadores logicos?")
    val caliOperadorLogico : Int = readLine()!!.toInt()

    println("¿Que nota obtuvo en condiciones?")
    val caliCondiciones : Int = readLine()!!.toInt()

    val promedio = (caliVariables + caliOperacionMatematica + caliOperadorLogico + caliCondiciones) / 4

    if (promedio == 10) {
        println("Tu resultado es sobresaliente, tienes un $promedio")
    }
    else if (promedio == 9) {
        println("Tu resultado es bueno, tienes un $promedio")
    }
    else if (promedio >= 6 && promedio <= 8) {
        println("Tu resultado es suficiente, tienes un $promedio")
    }
    else {
        println("Tu resultado es insuficiente, tienes un $promedio")
    }


}