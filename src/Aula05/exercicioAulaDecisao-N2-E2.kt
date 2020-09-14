package Aula05

/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
usuário a valor do saque e depois informar quantas notas de cada valor serão
fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de
100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de
100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

Quanto você quer sacar? 425
4 notas de 100
2 notas de 10
1 notas de 5

*/

fun main() {

    println("Digite o valor do saque:")
        var valorSaque = readLine()!!.toInt()
        var notas = 0


    if (valorSaque < 10) {
        println("Saque negado! Valor inferior ao mínimo.")
    } else if(valorSaque > 600) {
        println("Saque negado! Valor excede o máximo permitido.")
    } else {
        notas = valorSaque  / 100
        if (notas > 0) {
            println("$notas Cédulas de R$100")
        }
        valorSaque -= (100 * notas)

        notas = valorSaque / 50
        if (notas > 0) {
            println("$notas Cédulas de R$50")
        }
        valorSaque -= (50 * notas)

        notas = valorSaque / 10
        if (notas > 0) {
            println("$notas Cédulas de R$10")
        }
        valorSaque -= (10 * notas)

        notas = valorSaque / 5
        if (notas > 0) {
            println("$notas Cédulas de R$5")
        }
        valorSaque -= (5 * notas)

        if (valorSaque > 0) {
            println("$valorSaque Cédulas de R$1")
        }

    }
}