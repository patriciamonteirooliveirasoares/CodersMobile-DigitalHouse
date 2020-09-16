package Aula07

fun main() {
    val atleta1 = Atleta("Patricia", 30, 200)
    val atleta2 = Atleta("Cristiano", 15, 80)

    val provaA = Prova(0,10)
    val provaB = Prova(50,30)
    val provaC = Prova(80,50)

    provaA.realizarProva(atleta1)
    provaB.realizarProva(atleta1)
    provaC.realizarProva(atleta1)
    provaA.realizarProva(atleta2)
    provaB.realizarProva(atleta2)
    provaC.realizarProva(atleta2)

}