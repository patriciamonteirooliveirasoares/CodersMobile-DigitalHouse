package Aula07

fun main() {
    var primeiroCliente = Cliente("Patricia", "Soares")
    var segundoCliente = Cliente("Paloma", "Monteiro")
    var primeiraConta = Conta(1, 45000.00, primeiroCliente)
    var segundaConta = Conta(2, 8100.00, segundoCliente)

    primeiraConta.deposito(8500.00)
    primeiraConta.saque(110.00)
    segundaConta.deposito(1970.00)
    segundaConta.saque(5690.00)
}