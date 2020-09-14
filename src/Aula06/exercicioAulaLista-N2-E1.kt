package Aula06

/*
Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete
feita a um grande quantidade de organizações:

"Qual o melhor Sistema Operacional para uso em servidores?"
As possíveis respostas são:
1- Windows Server
2- Unix
3- Linux
4- Netware
5- Mac OS
6- Outro

Você foi contratado para desenvolver um programa que leia o resultado da enquete
e informe ao final o resultado da mesma. O programa deverá ler os valores até ser
informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos
valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma
das opções devem ser armazenados num vetor. Após os dados terem sido
completamente informados, o programa deverá calcular a percentual de cada um
dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado
pela empresa, e é o seguinte:

Sistema Operacional Votos %
------------------- ----- ---
Windows Server 1500 17%
Unix 3500 40%
Linux 3000 34%
Netware 500 5%
Mac OS 150 2%
Outro 150 2%
------------------- -----
Total 8800
O Sistema Operacional mais votado foi o Unix, com 3500 votos,
correspondendo a 40% dos votos.

*/

fun main(){

    val sistemasOperacionais = intArrayOf(0, 0, 0, 0, 0, 0);
    val nomesSistemasOperacionais = arrayOf("Windows Server     ", "Unix               ", "Linux              ",
        "Netware            ", "Mac OS             ", "Outros             ");

    do {
        println("Digite 0 - para sair, 1- para votar em Windows Server, 2- para votar em Unix, 3- para votar em Linux " +
                "4- para votar em Netware, 5- para votar em Mac OS e 6- para votar em outros")
        var voto = readLine()!!.toInt();

        if(voto < 0 || voto > 6){
            println("Voto inválido");
            continue;
        }
        else if(voto == 0)
            break;

        sistemasOperacionais[voto-1]++;
    }while(true)

    var sum = 0.0;
    sum = sistemasOperacionais.sum().toDouble();

    println("SISTEMA OPERACIONAl       |       VOTOS       |           %");
    for(x in 0..5){
        var percentage = (sistemasOperacionais[x] * 100) / sum;

        println(nomesSistemasOperacionais[x] + "       |       " + sistemasOperacionais[x] + "           |           " + "%.2f".format(percentage) + "%");
    }
    print("Total de votos: $sum");
}

