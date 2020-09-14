fun main() {
    val bigger: Int

    print("Informe o 1º número: ")
    val n1 = readLine()!!.toInt()
    print("Informe o 2º número: ")
    val n2 = readLine()!!.toInt()
    print("Informe o 3º número: ")
    val n3 = readLine()!!.toInt()

    if (n1 > n2 && n1 > n3) bigger = n1
    else if (n2 > n1 && n2 > n3) bigger = n2
    else bigger = n3

    print("O maior número é: $bigger")
}

/* Escrever o código que deve analisar três números inteiros e retornar o maior
deles.*/