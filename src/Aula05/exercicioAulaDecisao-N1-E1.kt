package Aula05

/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

fun main (){

    println("Qual o seu sexo? ")
    var sexo = readLine()

    when(sexo){
        "F","f" -> println("FEMININO")
        "M","m"-> println("MASCULINO")
        else -> println("Sexo inválido")
    }
}
