package Aula07

class Conta (numConta: Int, var saldo: Double, titular: Cliente) {

    fun deposito(valorDeposito: Double) {

        saldo += valorDeposito
        println("Você realizou um depósito no valor de R$$valorDeposito e o seu saldo agora é de R$$saldo")
    }


    fun saque(valorSaque: Double) {

        if (valorSaque > saldo) {
            println("Saldo Insuficiente")

        } else {
            saldo -= valorSaque
            println("Você realizou um saque no valor de R$$valorSaque da sua conta, e seu saldo agora é de R$$saldo.")
        }
    }

}