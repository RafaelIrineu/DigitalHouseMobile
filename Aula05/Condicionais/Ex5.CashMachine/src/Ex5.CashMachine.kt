fun main(){
    println("-- Caixa Eletrônico Santander --")
    println("Saque mínimo: R$ 10,00. Saque máximo R$ 600,00")
    println("Notas disponíveis: 100, 50, 20, 10, 5 e 1")
    print("Informe o valor do saque: ")

    var value = readLine()!!.toInt()

    if(value<10||value>600) {
        print("Saque mínimo: R$ 10,00. Saque máximo R$ 600,00")
    }
    else {
        var n100 = (value / 100).toInt()
        var r1 = (value % 100)

        var n50 = (r1 / 50).toInt()
        var r2 = (r1 % 50)

        var n20 = (r2 / 20).toInt()
        var r3 = (r2 % 20)

        var n10 = (r3 / 10).toInt()
        var r4 = (r3 % 10)

        var n5 = (r4 / 5).toInt()
        var r5 = (r4 % 5)

        var n1 = (r5 / 1).toInt()

        println("O saque terá:")

        if (n100 > 0) println("$n100 notas de R$ 100,00")
        if (n50 > 0) println("$n50 notas de R$ 50,00")
        if (n20 > 0) println("$n20 notas de R$ 20,00")
        if (n10 > 0) println("$n10 notas de R$ 10,00")
        if (n5 > 0) println("$n5 notas de R$ 5,00")
        if (n1 > 0) println("$n1 notas de R$ 1,00")
    }
}