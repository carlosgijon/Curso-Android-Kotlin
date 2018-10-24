package seccionseis

fun main(args: Array<String>) {

    var arrayUno = Array<Int>(5){0}

    arrayUno[1] = 5
    arrayUno[2] = -15
    arrayUno[3] = 50
    arrayUno[4] = 100

    println("Array en la posición tres es " +arrayUno[3])

    for (elemento in arrayUno) {
        println(elemento)
    }

    println("-----------------------------------")

    for (indice in 0..4) {
        println(arrayUno[indice])
    }

    println("-----------------------------------")

    val fruta = Array<String>(2){""}

    // Vamos a ingresar por consola los valores del array
    for (indice in 0..1) {
        println("Ingresa la fruta del indice[$indice]")
        fruta[indice] = readLine()!!
    }

    // Ahora vamos a recorrerlos
    for (indice in 0..1) {
        println("La fruta del indice $indice es " +fruta[indice])
    }



}