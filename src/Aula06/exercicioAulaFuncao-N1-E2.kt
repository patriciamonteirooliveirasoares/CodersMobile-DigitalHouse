package Aula06

/*
Faça um programa, com uma função que necessite de um argumento. A função
retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
argumento for zero ou negativo.
*/

fun main() {

    while(true) {
        var numRecebido = readLine()!!.toInt()
        println(positivoNegativo(numRecebido))
    }
}

fun positivoNegativo(numero: Int): String{
    if( numero > 0 ) {
        return "P"
    }else{
        return "N"
    }
}