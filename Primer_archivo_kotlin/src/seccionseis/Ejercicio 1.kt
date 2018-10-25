package seccionseis

fun main(args: Array<String>) {

    val primer_array = Array(4){0}
    val segundo_array = Array(4){0}
    val resultados = Array(4){0}

    println("Vamos a rellenar el primer arrays")

    for (indice in 0..primer_array.size - 1) {
        println("Introduce un numero para el indice $indice")
        primer_array[indice] = readLine()!!.toInt()
    }

    println("Vamos a rellenar el segundo arrays")

    for (indice in 0..segundo_array.size - 1) {
        println("Introduce un numero para el indice $indice")
        segundo_array[indice] = readLine()!!.toInt()
    }

    println("Las sumas de los valores de los arrays según su indice dan")

    for (indice in 0..resultados.size -1) {
        resultados[indice] = primer_array[indice] + segundo_array[indice]
        println(resultados[indice])
    }
}