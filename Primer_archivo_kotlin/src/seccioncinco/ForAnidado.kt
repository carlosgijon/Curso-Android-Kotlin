package seccioncinco

fun main(args: Array<String>) {

    for (contador in 1..5) {
        println("Contador es: $contador")

        for (contador2 in 1..3) {
            println("Contador2 es: $contador2")
        }

        println("For anidado concluido")
    }

    println("El ciclo For ha terminado")
}