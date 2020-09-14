package Aula06

/*
Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador
lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez
um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os
dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes
de tirar este Ponto novamente. Exemplo:

a.
Rolar dados? (s ou n)
Você tirou 7! Parabéns você ganhou!
b.
Rolar dados? (s ou n)
Você tirou 8! Aperte enter para tentar novamente

Você tirou 7! Você perdeu =(
Dica: Para obter valores aleatórios use

Random.nextInt(DE, ATE)

*/

import kotlin.random.Random

fun  main () {

     println("Rolar dados?? (s ou n)")
     var rolar = readLine()
     var ladoValor = 0
     var outroValor : Int? = null
        if(rolar == "s"){
            ladoValor = rolarDado()
            var resultado = resultadoVerificar(ladoValor, null)
            if(resultado == 0){
                println("Você tirou $ladoValor! Parabéns você ganhou!")
            }
            else if(resultado == 1){
                println("Você tirou $ladoValor! Você perdeu =(")

            }
            else{
                println("Você tirou $ladoValor! Aperte enter para tentar novamente")
                readLine()
                outroValor = ladoValor
                while(true){
                    outroValor = rolarDado()
                    resultado = resultadoVerificar(ladoValor, outroValor)
                    if(resultado == 0){
                        println("Você tirou $ladoValor! Parabéns você ganhou!")
                        break
                    }
                    else if(resultado == 1){
                        println("Você tirou $ladoValor! Você perdeu =(")
                        break
                    }
                    println("Você tirou $ladoValor! Aperte enter para tentar novamente")
                    readLine()
                }
            }
        }
        else{
            println("Acabou o jogo!")
        }
    }

    fun rolarDado() : Int{
        return Random.nextInt(2, 12)
    }

    fun resultadoVerificar(result : Int, oldResult: Int?) : Int{
        if(oldResult == null) {
            when (result) {
                7, 11 -> return 0
                2, 3, 12 -> return 1
                4, 5, 6, 8, 9, 10 -> return 2
                else -> return 3
            }
        } else {
            return if (result == oldResult) {
                0
            } else if (result == 7) {
                1
            } else {
                2
            }
        }
    }