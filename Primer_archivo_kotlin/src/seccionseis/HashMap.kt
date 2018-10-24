package seccionseis

fun main(args: Array<String>) {

    val hashmap = HashMap<Int, String>()

    hashmap.put(1, "Merida")
    hashmap.put(200, "Villahermosa")
    hashmap.put(0, "Izamal")
    hashmap.put(50, "Seve")

    println(hashmap[200])

    hashmap.put(50, "Valdez")

    for (clave in hashmap.keys) {
        println(hashmap[clave])
    }

}