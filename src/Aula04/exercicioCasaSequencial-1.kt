package Aula04

/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.

Digite a nota 1: 10
Digite a nota 2: 5
Digite a nota 3: 7
Digite a nota 4: 8
A média é 7,5

*/

fun main () {
    println("Digite a nota 1: ")
    var nota1 = readLine()!!.toFloat()
    println("Digite a nota 2: ")
    var nota2 = readLine()!!.toFloat()
    println("Digite a nota 3: ")
    var nota3 = readLine()!!.toFloat()
    println("Digite a nota 4: ")
    var nota4 = readLine()!!.toFloat()

    var media = (nota1+nota2+nota3+nota4)/4

    print("A média é $media")

}
