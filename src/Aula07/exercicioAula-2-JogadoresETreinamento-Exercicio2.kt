package Aula07

fun main() {
    val jogador1 = JogadorDeFutebol("Patricia",50,
            3, 2, 1)
    val jogador2 = JogadorDeFutebol(
            "Cristiano",30,
            1, 0, 2)

    val treinamento = SessaoDeTreinamento()
    treinamento.treinarA(jogador1)
    println(jogador1.toString())
    treinamento.treinarA(jogador2)
    println(jogador2.toString())

}