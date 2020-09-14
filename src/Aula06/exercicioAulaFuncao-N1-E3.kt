package Aula06

/*
Faça um programa com uma função chamada somaImposto. A função possui
dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
expressa em porcentagem e custo, que é o custo de um item antes do imposto. A
função “altera” o valor de custo para incluir o imposto sobre vendas.
*/

fun main(){
    println("Digite o preço do produto: ");
    var preco = readLine()!!.toDouble();

    println("Digite a taxa de imposto: ");
    var taxaImposto = readLine()!!.toDouble();

    preco += somaImposto(taxaImposto, preco);

    println("O preço do produto com imposto é de: $preco")
}

fun somaImposto(taxRate: Double, preco: Double) : Double{
    return preco * (taxRate / 100);
}

