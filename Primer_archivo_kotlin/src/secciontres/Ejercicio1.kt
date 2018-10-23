package secciontres

/*
* Crear un programa que pida la entrada de una cantidad
* de articulos, su costo unitario y el total a pagar*/

fun main(args: Array<String>) {
    println("¿Cuantos articulos vas a comprar?")
    val cantidad_articulos: Int = readLine()!!.toInt()

    println("¿Cuanto cuesta cada uno?")
    val coste: Int = readLine()!!.toInt()

    val total: Int = cantidad_articulos * coste

    println("Has comprado $cantidad_articulos articulos a $coste € cada uno.")
    println("En total son $total €")
}