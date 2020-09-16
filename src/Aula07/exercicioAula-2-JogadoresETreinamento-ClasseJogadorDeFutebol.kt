package Aula07

class JogadorDeFutebol(var nome: String, var alegria: Int, var gols: Int, var energia: Int, var experiencia: Int ) {

    fun fazerGol(): Int {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOL!")
        return gols
    }

    fun correr(): Int {
        energia -= 10
        println("Cansei!")
        return energia
    }
}