package seccionocho

class Persona(nombre: String, edad: Int, altura: Double, peso: Double, colorOjos: String, genero: String) {

    // Crear variables de instancia
    var nombre: String?  // Puede ser null
    var edad: Int?
    var altura: Double?
    var peso: Double?
    var colorOjos: String?
    var genero: String?

    init {

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

}

fun main(args: Array<String>) {

    var person= Persona("Lola", 30, 1.50, 50.00, "Marron cucaracha", "Mujer")
    println("El nombre es " + person.GetNombre())

}