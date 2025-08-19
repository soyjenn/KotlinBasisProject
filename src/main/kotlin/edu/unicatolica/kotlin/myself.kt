package edu.unicatolica.kotlin

fun main(){
    val nombre = "Jennifer Andrea Salazar"
    val edad = 20
    val carrera = "Ingeniería de Sistemas"
    val semestre = "6to"
    val id = 407092
    val universidad = "Unicatolica"

    val interes = "me gusta la programación web y la analítica de datos, disfruto aprender cosas nuevas y encontrar soluciones"
    val pasatiempos = "disfruto escuchar música, ir al gym y salir a comer"

    val mensaje = "Mi nombre es $nombre tengo $edad años, estudio $carrera en la $universidad estoy cursando $semestre semestre y mi id es $id. " +
            "En mis pasatiempos $pasatiempos" + " y mi principal interés es que $interes"
    println(mensaje)

}
