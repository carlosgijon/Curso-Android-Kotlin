package seccioncinco

fun main(args: Array<String>) {
    var pares : Int = 0
    var mensaje_pares : String = ""
    var impares : Int = 0
    var mensaje_impares : String = ""
    var contador : Int = 1

    println("¿Cuantos numeros vas a cargar?")
    val num_valores : Int = readLine()!!.toInt()
    var numero : Int?

    while(contador <= num_valores) {
        println("Introduce el numero $contador:")
        numero = readLine()!!.toInt()

        if (numero % 2 == 0) {
            if (pares == 0) {
                mensaje_pares += numero.toString()
            }
            else {
                mensaje_pares += " ${numero.toString()}"
            }
            pares++
        }
        else {
            if (impares == 0) {
                mensaje_impares += numero.toString()
            }
            else {
                mensaje_impares += " ${numero.toString()}"
            }
            impares++
        }

        contador++

    }

    println("")
    println("Numeros pares introducidos: $mensaje_pares")
    println("TOTAL PARES: $pares")
    println("Numeros pares introducidos: $mensaje_impares")
    println("TOTAL IMPARES: $impares")
}