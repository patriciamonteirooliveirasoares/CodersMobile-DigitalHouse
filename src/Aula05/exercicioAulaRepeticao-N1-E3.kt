package Aula05

/*
Faça um programa que receba dois números inteiros e gere os números inteiros
que estão no intervalo compreendido por eles.
*/

fun main() {
    println("Digite o primeiro número: ")
    var numero1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    var numero2 = readLine()!!.toInt()

    for(i in numero1..numero2){
        println(i)
    }
}