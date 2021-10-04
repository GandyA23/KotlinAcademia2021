import java.text.DecimalFormat

// Variables globales
var tasaCambio = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja = 0.0

val FORMATO = "#,###.00"

// Lectura
private fun readLn() = readLine()!!
private fun readDouble() = readLn().toDouble()

// Darle formato a la salida
private fun formatTwoDecimals (cantidad : Double) : String {
    return DecimalFormat(FORMATO).format(cantidad)
}

private fun controlDeOperaciones () {
    print("Ingresa la cantidad de dólares a cambiar: $")
    val dolaresACambiar = readDouble()

    dolaresEnCaja += dolaresACambiar

    val pesosAEntregar = tasaCambio * dolaresACambiar

    pesosEnCaja -= pesosAEntregar

    println("""
        ** Recibo **
        Pesos MX a entregar: $${formatTwoDecimals(pesosAEntregar)}
        
        Pesos MX en caja: $${formatTwoDecimals(pesosEnCaja)}
        Dólares US en caja: $${formatTwoDecimals(dolaresEnCaja)}  
    """.trimIndent())

}

fun main() {
    print("Ingresa la tasa de cambio de un dólar a pesos: $")
    tasaCambio = readDouble()

    print("Ingresa la cantidad de pesos mexicanos para la apetura de la caja: $")
    pesosEnCaja = readDouble()

    print("Ingresa la cantidad de dólares para la apetura de la caja: $")
    dolaresEnCaja = readDouble()

    controlDeOperaciones()
}