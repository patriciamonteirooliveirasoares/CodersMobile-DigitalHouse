package Aula06

/*
Faça um Programa que peça a altura de 5 pessoas, armazene cada informação
num array. Imprima a altura na ordem inversa a ordem lida.
*/

fun main(){
    val alturas = ArrayList<Double>();

    for(num in 0..4){
        println("Digite sua altura")
        var valor = readLine()!!.toDouble();

        alturas.add(valor);
    }
    println("Normal")
    alturas.forEach{ x ->
        print("$x,");
    }
    alturas.reverse();

    println("Reverso")
    alturas.forEach{ x ->
        print("$x ,");
    }
}