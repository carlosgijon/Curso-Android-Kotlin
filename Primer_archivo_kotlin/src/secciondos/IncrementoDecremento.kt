package secciondos

/*
*  Jerarquia de las operaciones
*
* 1.- ()
* 2.- ++, -- (antes de la variable)
* 3.- ^  Exponente
* 4.- *, /
* 5.- +, -
* 6.- % mod
* 7.- =
* 8.- ++, -- (despues de la variable)
*
* Si pertenecen al mismo rango la prioridad irá de izquierda a derecha
*
* */

fun main(args: Array<String>) {

    var num1 = 10
    val num2 = 5

    val resultado: Int?

    println(num1)
    resultado = ++num1 + num2

    println("El resultado es $resultado")
    println(num1)


}