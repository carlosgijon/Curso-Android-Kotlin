package seccionochoimport

import seccionocho.Persona

fun main(args: Array<String>) {

    var person= Persona("Lola", 30, 1.50, 50.00, "Marron cucaracha", "Mujer")
    println("El nombre es " + person.GetNombre())

}