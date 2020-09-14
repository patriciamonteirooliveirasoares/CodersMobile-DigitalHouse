package Aula06

import kotlin.math.max

/*
Escrever o código que deve analisar três números inteiros e retornar o maior
deles.
*/

fun main() {

    println("Digite três número:")
    var numero = 0.0
    var maximo = Double.MIN_VALUE

    for(i in 1..3){
        numero = readLine()!!.toDouble()

        maximo = max(numero,maximo)
    }
    println(maximo)
}