package Aula06

/*
Faça um Programa que leia um vetor de 10 números e mostre-os na ordem
inversa.
*/

fun main(){
    val valores = ArrayList<Int>();

    for(num in 0..9){
        println("Digite um número")
        var numero = readLine()!!.toInt();

        valores.add(numero);
    }
    valores.reverse();
    valores.forEach{ i ->
        println(i);
    }
}