package Aula05

/*
Faça um Programa que peça um número inteiro e determine se ele é par ou
ímpar. Dica: utilize o operador módulo (resto da divisão).
*/

fun main(){

    println("Digite um número inteiro: ")
    var numeroInteiro = readLine()!!.toInt()

    if (numeroInteiro %2 == 0) {
        println("É PAR")
    } else {
        print("É ÍMPAR")
    }
}