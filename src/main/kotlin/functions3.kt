fun main() {
    val resultado = agregar(5, 3)
    
    if (resultado > 0) {
        println("El resultado es positivo: $resultado")
    } else if (resultado < 0) {
        println("El resultado es negativo: $resultado")
    } else {
        println("El resultado es cero")
    }
}

fun agregar(a: Int, b: Int) : Int = a + b

fun obtenerMes(mes: Int): String {
    return when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes inválido"
    }
}
