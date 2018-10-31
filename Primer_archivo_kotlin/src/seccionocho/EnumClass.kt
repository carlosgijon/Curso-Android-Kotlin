package seccionocho

enum class Meses {

    ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC

}

fun main(args: Array<String>) {

    var sextoMes = Meses.JUN
    var primerMes = Meses.ENE

    println("nombre: " +sextoMes.name)
    println("posicion: " +sextoMes.ordinal)
    println("posicion: " +primerMes.ordinal)
    println("Comparar: " +sextoMes.compareTo(primerMes))
    println("Comparar: " +primerMes.compareTo(sextoMes))

    println("------------------------------------------")

    for (mes in Meses.values()) {
        println(mes)
    }

}