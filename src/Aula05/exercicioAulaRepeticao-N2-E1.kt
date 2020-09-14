package Aula05

/*
Faça um programa que calcule e mostre a média aritmética de N notas.
*/

fun main()
{

    var nNotas = 0.0;
    var nNota = 0.0;
    var nQtde = 0;

    do
    {
        println("Digite uma nota (ou um número negativo para sair): ");
        nNota = readLine()!!.toDouble();

        if(nNota>0){
            nNotas+= nNota;

        nQtde++;
        }
    } while(nNota >= 0)

    println("Média das notas: ${nNotas / nQtde}");

}

