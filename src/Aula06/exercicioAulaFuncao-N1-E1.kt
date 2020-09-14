package Aula06

/*
Faça um programa, com uma função que necessite de três argumentos, e que
forneça a soma desses três argumentos.
*/

fun main() {

    var numeros = soma(1,2,3)

    println("Resultado: $numeros")
}

fun soma(num1: Int, num2: Int, num3: Int): Int{
    var resultado = num1 + num2 + num3
    return resultado
}
