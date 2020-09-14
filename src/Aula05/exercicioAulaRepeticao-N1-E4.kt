package Aula05

/*
4. Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
*/

fun main() {

    println("Digite seu nome: ")
    var nome = readLine()!!.toString()

    println("Digite sua idade: ")
    var idade = readLine()!!.toInt()

    println("Digite seu Salário: ")
    var salario = readLine()!!.toDouble()

    println("Digite seu Sexo: (use F ou M)")
    var sexo = readLine()!!.toString()

    println("QDigite seu Estado Civel: (use S, C, V ou D)")
    var estadoCivil = readLine()!!.toString().toUpperCase()

    if (nome.length > 3)
        println(nome)

    if (idade < 0 || idade > 150)
        println(idade)

    if (salario > 0)
        println(salario)

    if (!sexo.equals("M") || !sexo.equals("F"))
        println(sexo)

    if (!estadoCivil.equals("S") || !estadoCivil.equals("C") || !estadoCivil.equals("V") || !estadoCivil.equals("D"))
        println(estadoCivil)

}


