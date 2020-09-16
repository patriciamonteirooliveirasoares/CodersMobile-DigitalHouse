package Aula07

class Carro(var consumo:Double) {
    var tanqueCombustivel:Double = 0.0

    fun andar(quilometros:Double) {
        val gastoCombustivel = quilometros/consumo

        if (tanqueCombustivel >= gastoCombustivel) {
            println("Pode seguir!")
            tanqueCombustivel -= gastoCombustivel
        } else {
            println("Você precisa abastecer!")
        }
    }

    fun obterGasolina() {
        println("Níquel do tanque:  ${this.tanqueCombustivel}.")
    }

    fun adicionarGasolina(qtdGasolina: Int) {
        tanqueCombustivel += qtdGasolina
        println("Adicionado $qtdGasolina litros ao tanque de combustível!")
    }
}