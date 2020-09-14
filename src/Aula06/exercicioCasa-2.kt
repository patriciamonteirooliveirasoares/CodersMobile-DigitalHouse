package Aula06

/*
Escrever o código que deve analisar duas cadeias de texto e, caso sejam
diferentes, retornar true, ou, caso sejam iguais, retornar false.
*/

fun main(){
    println("Digite um texto: ")
    var texto1 = readLine()!!

    println("Digite outro texto: ")
    var texto2 = readLine()!!

    print("O resultado é: " + textAnalysis(texto1, texto2))

}

fun textAnalysis(texto1: String, texto2: String) : Boolean{
    return !texto1.equals(texto2)
}