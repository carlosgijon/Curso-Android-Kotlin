package secciondos

/*
*  Jerarquia de las operaciones
*
* 1.- ()
* 2.- ^  Exponente
* 3.- *, /
* 4.- +, -
* 5.- % mod
*
* Si pertenecen al mismo rango la prioridad irá de izquierda a derecha
*
* */

fun main(arg: Array<String>) {
    val num1 = 10
    val num2 = 5
    val num3 = 2

    val resultado: Int?  // sin imicializar

    resultado = num1 / (num2 * num3) - 1

    println("El resultado es $resultado")
}