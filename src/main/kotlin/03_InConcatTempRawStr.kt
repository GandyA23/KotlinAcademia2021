/*
* Lectura con consola, concatenación, raw string y template string
* */

fun main () {
    // Lectura desde consola con el método readLine
    print("Ingresa tu nombre: ")
    val nombre = readLine()

    print("Ingresa tu edad: ")
    val edad = readLine()

    // Concatenación de cadenas
    val mensaje = "Tu nombre es " + nombre + " y tu edad es " + edad + " años"

    // Template string
    val templateString = "Tu nombre es $nombre y tu edad es $edad años"

    // Raw String da un formato a como lo mostrará en consola
    val rawString = """
        *** Datos ***
        Nombre: $nombre
        Edad: $edad años
    """.trimIndent()

    println(mensaje)
    println(templateString)
    println(rawString)
}