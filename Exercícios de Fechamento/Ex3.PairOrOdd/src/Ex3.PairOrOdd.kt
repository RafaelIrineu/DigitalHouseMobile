fun main() {
    print("Informe um número inteiro: ")
    val number = readLine()!!.toInt()

    if (number % 2 == 0) print(true)
    else print(false)
}

/*Escrever o código que deve analisar um número inteiro e, caso ele seja par,
retornar true, caso contrário, retorna false.*/