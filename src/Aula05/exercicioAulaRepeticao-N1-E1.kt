import kotlin.math.max

/*
Faça um programa que leia 5 números e informe o maior número.
*/

fun main() {

    println("Digite cinco número:")
    var numero = 0.0
    var maximo = Double.MIN_VALUE

    for(i in 1..5){
        numero = readLine()!!.toDouble()

        maximo = max(numero,maximo)
    }
    println(maximo)
}