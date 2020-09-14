fun main() {
    print("Escreva seu 1º texto: ")
    val text1 = readLine()!!.toString()
    print("Escreva seu 2º texto: ")
    val text2 = readLine()!!.toString()

    if (text1.equals(text2)) print(false)
    else print(true)
}

/*Escrever o código que deve analisar duas cadeias de texto e, caso sejam
diferentes, retornar true, ou, caso sejam iguais, retornar false.*/