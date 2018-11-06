package seccionnueve

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    println("Opcion 1 para leer\nOpcion 2 para escribir")
    var opcion = readLine()!!.toInt()

    when(opcion) {

        1 -> leerArchivos()
        2 -> {
            println("Escribe tu texto")
            var texto = readLine()!!.toString()
            escribirArchivo(texto)
        }
    }

}

fun escribirArchivo(texto: String) {

    try {
        var archivo = FileWriter("prueba.txt",true)
        archivo.write(texto + "\n")
        archivo.close()
        println("Se ha guardado correctamente")
    }
    catch(e: Exception) {
        println(e.message)
    }

}

fun leerArchivos() {
    try {
        var leer = FileReader("prueba.txt")
        var caracter: Int?

        do {
            caracter = leer.read()  // VA EN CODIGO ASCII, HAY QUE CONVERTIR A CHAR
            print(caracter.toChar())
        }while (caracter != -1)  // Devuelve -1 cuando acaba
    }
    catch (e: Exception) {
        println(e.message)
    }
}