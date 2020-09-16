package Aula07

fun main() {
    val cliente = Cliente("Patricia", "Soares", "982660217")
    val carro = Veiculo("Volkswagen, "Nivus", 2020, "Azul", 50000f)
    val registrarVenda = Venda(115000.00, carro, cliente)

    val clientes = ArrayList(Cliente)
    val carros = ArrayList(Carro)
    val registrarVenda = ArrayList(Venda)

    val concessonaria = Concessionaria(carros, clientes, registrarVenda)
    println(concessonaria.vendas)
    concessonaria.registrarVenda(carro, cliente, 10000.00)
    println(concessonaria.vendas)
 }
}
