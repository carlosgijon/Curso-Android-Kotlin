package seccionseis

fun main(args: Array<String>) {

    val hashmap = hashMapOf(1 to "Carlos", 2 to "Lola")
    hashmap.put(50, "Piolin")

    println(hashmap[50])

    val letras = arrayOf("a", "b", "c")
    println(letras[1])

    val nums = listOf(0, 1, -12, -24)

    for (elemento in nums) {
        println(elemento)
    }

}