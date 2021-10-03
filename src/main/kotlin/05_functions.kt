import java.util.*

/*
Funciones

Función sin parámetros
Ejemplo básico para declarar una función
private fun ejemplo () {
    // inserte código aquí
}

invocar: ejemplo()

Función con parámetros
fun ejemplo (datoUno: String, datoDos : Int) {
    // inserte código aquí
}

invocar: ejemplo("Hola", 123)

Funciones con valor de retorno
fun ejemplo () : String {
    // Código
    return "Hola desde Kotlin"
}

Funciones con un valor predeterminado
fun ejemplo (datoUno : String = "Hola") {
    // código
}

invocar: ejemplo() ó ejemplo("GandyA23") ó ejemplo(datoUno = "GandyA23")
*/

fun main () {
    mostrarMensaje()
    mostrarMensaje()
    mostrarMensaje()

    mostrarDatos("Gandy Esau", 20)
    mostrarDatos("Luis", 22)
    mostrarDatos("Regina", 20)

    println(calcularImpuestos(10_000.00))
    println(calcularImpuestos(1000.00,10.0))
    println(calcularImpuestos(salario = 3000.0))
}

// Muestra un mensaje de bienvenida e imprime la fecha y hora
fun mostrarMensaje () {
    println("""
        Mensaje: Hola desde Kotlin 
        Fecha: ${Date()}
    """.trimIndent())
}

// Muestra los datos de una persona
fun mostrarDatos (nombre : String, edad : Int) {
    println("""
        Nombre: $nombre
        Edad: $edad
    """.trimIndent())
}

// Calcula los impuestos
fun calcularImpuestos (salario : Double, porcentaje : Double = 16.0) : Double {
    return salario / 100 * porcentaje
}