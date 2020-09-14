package Aula05

/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa
no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
Caso contrário, ele será classificado como "Inocente".
Use “S” para sim e “N” para não.

*/

fun main(){
    var respostaSim = 0

    println("Use 'S' para sim e 'N' para não")
    print("Telefonou para a vítima? ")
    var primeiraPergunta = readLine()!!.toString()
    if(primeiraPergunta.toUpperCase().equals("S")) {
        respostaSim += 1
    }

    print("Esteve no local do crime? ")
    var segundaPergunta = readLine()!!.toString()
    if(segundaPergunta.toUpperCase().equals("S")) {
        respostaSim += 1
    }

    print("Mora perto da vítima? ")
    var terceiraPergunta = readLine()!!.toString()
    if(terceiraPergunta.toUpperCase().equals("S")) {
        respostaSim += 1
    }

    print("Devia para a vítima? ")
    var quartaPergunta = readLine()!!.toString()
    if(quartaPergunta.toUpperCase().equals("S")) {
        respostaSim += 1
    }

    print("Já trabalhou com a vítima? ")
    var quintaPergunta = readLine()!!.toString()
    if(quintaPergunta.toUpperCase().equals("S")) {
        respostaSim += 1
    }

    when (respostaSim) {
        2 -> {
            print("Suspeito!")
        }
        in 3..4 -> {
            print("Cúmplice!")
        }
        5 -> {
            print("Assassino!")
        }
        else -> {
            print("Inocente!")
        }
    }
}