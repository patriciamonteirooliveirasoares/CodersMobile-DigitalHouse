package Aula06

/*
Escrever o código que deve analisar um número inteiro e, caso ele seja par,
retornar true, caso contrário, retorna false.
*/

fun main(){

    println("Digite um número inteiro: ")
    var numeroInteiro = readLine()!!.toInt()

    if (numeroInteiro %2 == 0) {
        println("True")
    } else {
        print("False")
    }
}