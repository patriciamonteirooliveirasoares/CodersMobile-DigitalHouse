package Aula04

/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

Exemplo:

Quanto vale sua hora? 15
Quantas horas você trabalhou? 200
Você receberá R$ 3000,00

*/

fun main() {
    println("Cálculo de salário bruto")

    println("Qual o valor do seu salário (R$) por hora? ")
    var valorHora = readLine()!!.toFloat()
    println("Quantas horas você trabalhou esse mês? ")
    var horasTrabalhadas = readLine()!!.toFloat()

    var valorReceber = valorHora * horasTrabalhadas

    print("Você receberá como salário bruto este mês o total de R$" + valorReceber)

}
