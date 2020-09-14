package Aula06

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
*/

fun main(){
    val numeros = ArrayList<Int>();

    for(num in 0..4){
        println("Digite um número: ")
        var valor = readLine()!!.toInt();

        numeros.add(valor);
    }

    numeros.forEach{ elementos ->
        println(elementos);
    }
}