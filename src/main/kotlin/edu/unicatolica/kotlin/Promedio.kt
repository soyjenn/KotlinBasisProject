package edu.unicatolica.kotlin
import kotlin.math.pow
import kotlin.random.Random
import kotlin.math.max


fun add (primera_nota : Float, segunda_nota : Float, tercera_nota : Float): Float {return primera_nota + segunda_nota + tercera_nota}
fun div (primera_nota : Float, segunda_nota : Float, tercera_nota : Float): Float {return (primera_nota + segunda_nota + tercera_nota)/3}

fun main() {
    println(add(2.0f,2.5f,5.0f))
    println(div(2.0f,2.5f,5.0f))
}
