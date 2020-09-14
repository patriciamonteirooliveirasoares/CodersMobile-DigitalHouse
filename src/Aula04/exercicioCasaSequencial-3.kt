package Aula04

/*
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7 * h) - 58
Para mulheres: (62.1 * h) - 44.7

Exemplo:

Digite a altura: 1.73
Para homens: 67,77
Para mulheres: 62,73

*/

fun main() {
    println("O peso Ideal")

    println("Digite sua altura (m): ")
    var altura = readLine()!!.toFloat()

    var pesoHomens = (72.7 * altura) - 58
    var pesoMulheres = (62.1 * altura) - 44.7

    println("Peso ideal para homens: $pesoHomens")
    println("Peso ideal para mulheres: $pesoMulheres")

}
