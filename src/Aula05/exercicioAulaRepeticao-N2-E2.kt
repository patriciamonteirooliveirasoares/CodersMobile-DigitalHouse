package Aula05

/*
Faça um programa que calcule o valor total investido por um colecionador em sua
coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar
a quantidade de CDs e o valor para em cada um.
*/

fun main()
{

    var nQuantidade = 0;
    var nValor = 0.0;

    println("Informe a quantidade de discos: ");
    nQuantidade = readLine()!!.toInt();

    for (nCont in 1..nQuantidade)
    {
        println("Digite o preço do disco $nCont");
        nValor+= readLine()!!.toDouble();
    }

    println("O valor total da coleção é $nValor");
    println("O valor médio da coleção é ${nValor / nQuantidade}");

}





