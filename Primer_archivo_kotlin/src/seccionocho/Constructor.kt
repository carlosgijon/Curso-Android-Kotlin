package seccionocho

class Person() {

    // Crear variables de instancia
    var nombre: String? = null // Puede ser null
    var edad: Int? = null
    var altura: Double? = null
    var peso: Double? = null
    var colorOjos: String? = null
    var genero: String? = null

    constructor(nombre: String, edad: Int, altura: Double, peso: Double, colorOjos: String, genero: String) : this() {

        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.colorOjos = colorOjos
        this.genero = genero

    }

    // Crear un getNombre
    fun GetNombre(): String? {
        return this.nombre
    }

    fun GetGenero(): String? {
        return this.genero
    }

}

fun main(args: Array<String>) {

    var person = Person("Lola", 30, 1.50, 50.00, "Marron cucaracha", "Mujer")
    println("El nombre es " + person.GetNombre() + " y su genero es " + person.GetGenero())

    var person2 = Person("Carlos", 33, 1.70, 75.00, "Coca cola", "Hombre")
    println("El nombre es " + person2.GetNombre() + " y su genero es " + person2.GetGenero())

    var person3 = Person()
    person3.nombre = "Piolin"
    person3.genero = "Canario"
    println("El nombre es " + person3.GetNombre() + " y su genero es " + person3.GetGenero())


}