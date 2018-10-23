package secciondos

fun main(args: Array<String>) {

    println("introduce un numero para calcular su perímetro")
    val numero: Int = readLine()!!.toInt()

    println("el perimetro de $numero es " +numero * 4)

}