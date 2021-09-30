/*
* Variables
* var -> variable mutable, puede cambiar el valor durante cualquier proceso
* val -> constante, no puede cambiar el valor en ningún momento
*
* Ejemplo:
* val pais: String = "México"
*
* val pais: String
* pais = "México"   // Una vez asignado el valor no podrá cambiarse
*
* val pais = "México"
*
* val/var nombre: tipoDeDato = valor
* */

/*
* Tipos de datos Básicos:
*
* Primitivos - Enteros
* -Long
* -Int
* -Short
* -Byte
*
* Primitivos - Flotante
* -Double
* -Float
*
* Caracteres y cadenas
* -Char
* -String
*
* Lógico
* -Boolean
*/

fun main () {
    /*
    * Es posible separar los números con guiones bajos para identificarlos más rápido
    * (detalle para un programador), no tendrá ningún cambio al momento de imprimirlo.
    * */
    val numero = 1_000_000
    println(numero) // 1000000

    // Casteo de un Int a un Short
    val nShort = 10.toShort()
    println(nShort) // 10

    // Double
    val piDouble = 3.14159265359

    // Trunca los digitos hasta el soportado por float
    val piFloat = 3.14159265359F

    println(piDouble)   // 3.14159265359
    println(piFloat)    // 3.1415927

    val ch = 'a'
    val str = "abecedario"
    println(ch)
    println(str)

    val flag = true
    println(flag)
}