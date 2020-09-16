package Aula07

class SessaoDeTreinamento(val experiencia: Int) {
    fun treinarA(jogador1: JogadorDeFutebol) {
        TODO("Not yet implemented")
    }

}

fun treinarA(jogador: JogadorDeFutebol) {
    println("${jogador.nome} sue experiência é: ${jogador.experiencia}.")
    jogador.correr()
    jogador.fazerGol()
    jogador.correr()
    SessaoDeTreinamento(jogador)
    println("${jogador.nome} agora sua experiência é: ${jogador.experiencia}.")
}

}
