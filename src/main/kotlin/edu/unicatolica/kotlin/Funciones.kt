package edu.unicatolica.kotlin
import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max

fun section(title: String) {
    println("\n" + "=".repeat(75))
    println(title)
    println("=".repeat(75))
}
fun variablesAndTypes() {

    section("1) Variables and Types")

    val lang: String = "Kotlin"
    var counter = 0

    println("val lang = $lang")
    println("var counter = $counter")
    counter += 3
    println("counter after += 3 => $counter")
}

fun conditionalAsExpressions(n: Int) {

    section("2) Conditionals As Expressions & When")
    val parity = if(n % 2 ==0) "even" else "odd"
    println("n=$n is $parity")

    val description = when {
        n == 0 -> "Zero"
        n in 1..9 -> "one digit positive"
        n < 0 -> "negative"

        else -> "positive (>=10)"

    }

    println("Description: $description")
}

fun loopsDemo(){
    section("3) Loops: for / while / Do-While")
    //Always use when you know the range of the elements

    print("for 1 to 5: ")
    for (i in 1 .. 5) print("$i ")
    println()

    //Arreglo de datos Colecciones
    val list = listOf("a", "b", "c")
    print("for over list: ")
    for(x in list) print("$x ")
    println()

    //use when you don't know the range of elements, but u know a stop condition
    var x = 3
    print("while x>0: ")
    while (x > 0) {
        print("$x ")
        x--
    }
    println()

    //runs at least once w a condition
    var y = 0
    print("do-while y<1: ")
    do {
        print("$y ")
        y++
    } while (y < 1)

    println()
}

fun main() {

    println("Session 3")
    variablesAndTypes()
    conditionalAsExpressions(15)
    loopsDemo()



}


