package Aula04

/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que
leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a
quantidade de quilos além do limite e na variável multa o valor da multa que João deverá
pagar. Imprima os dados do programa com as mensagens adequadas.

Exemplo:

Digite o peso dos peixes: 75
Excedeu 25Kg
O Valor a ser pago é de R$ 100,00
*/

fun main() {
    println("Informe o peso de peixes(kg): ")
    var pesoPeixe = readLine()!!.toFloat()

    var excedente = pesoPeixe - 50
    println("Você excedeu $excedente" + "kgs")

    var multa = excedente * 4
    print("O valor da multa a ser paga é de R\$$multa")
}
