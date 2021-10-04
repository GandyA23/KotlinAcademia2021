import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

/*
* Operadores matemáticos, conversión de tipos
* de datos y redondeo de números
* */

/*
* Operadores aritméticos
* + Suma
* - Resta
* * Multiplicación
* / División
* % Residuo
* */

/*
* Jerarquía de las operaciones
* 1. ()
* 2. / * %
* 3. + -
* */

/*
* Operadores de asignación
* =     Asigna el valor a la variable
* +=    Suma el valor a la variable y lo asigna
* -=    Resta el valor a la variable y lo asigna
* *=    Multiplica el valor a la variable y lo asigna
* /=    Divide el valor a la variable y lo asigna
* %=    Realiza el residuo y lo asigan
* */

/*
* Operadores de incremento y decremento
* ++ suma una unidad
* -- resta una unidad
* */

/*
* Lectura de datos primitivos desde consola
* val num = readLine()!!.toDouble()
* */

/*
* Redondear valores al mas cercano
* val num = readLine()!!.toDouble()
* println(round(num))
*
* Truncar valores
* val num = readLine()!!.toDouble()
* println(floor(num))
*
* Redondear valores
* val num = readLine()!!.toDouble()
* println(ceil(num))
* * */

/*
* Formato de impreasión
* val pi = 3.141657
* println(DecimalFormat("#.##").format(pi))
* */

fun main () {
    val numero = 10
    var numero2 = numero

    // Suma
    println(numero + 10) // 20

    // Resta
    println(numero - 10) // 0

    // Multiplicación
    println(numero * 10) // 100

    // División
    println(numero / 10) // 1

    // Residuo
    println(numero % 3) // 1

    numero2 += 10       // numero2 = numero2 + 10
    println(numero2)    // 20

    numero2 -= 10       // numero2 = numero2 - 10
    println(numero2)    // 10

    numero2 *= 10       // numero2 = numero2 * 10
    println(numero2)    // 100

    numero2 /= 2        // numero2 = numero2 / 2
    println(numero2)    // 50

    numero2 %= 5        // numero2 = numero2 % 5
    println(numero2)    // 0

    numero2++;          // 1
    println(numero2++)  // Imprime 1
    println(++numero2)  // Imprime 3
    println(numero2--)  // Imprime 3
    println(--numero2)  // Imprime 1

    // Lectura de valores primitivos en consola
    // print("Ingrese un número con decimales: ")
    // val num = readLine()!!.toDouble()
    val num = 5.5
    println(num + 5.5)

    val pi = 3.141579
    println(round(pi))  // Redondea al mas cercano
    println(floor(pi))  // Trunca
    println(ceil(pi))   // Redondea

    // Formato de dos decimales a pi
    println(DecimalFormat("#.##").format(pi))
}