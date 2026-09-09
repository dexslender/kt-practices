fun main() {
    // "var" se usa para declarar variables mutables
    // "val" se usa para declarar variables de inmutables
    // usar siempre val para evitar errores o cambios no esperados
    // usar var cuando se conoce que cambia

    var a = 10.5
    var b = 5

    println("suma: ")
    var resultado = a+b
    println(resultado)
    
    println("resta: ")
    println(a-b)
    
    println("multiplicación: ")
    println(a * b)
    
    println("division: ")
    println(a / b)
    
    println("modulo: ")
    println(a % b)
}
