fun main(){
    print("Informe o 1º número inteiro: ")
    val numA = readLine()!!.toInt()
    print("Informe o 2º número inteiro: ")
    val numB = readLine()!!.toInt()
    print("Informe o 3º número inteiro: ")
    val numC = readLine()!!.toInt()
    print("Informe o 4º número inteiro: ")
    val numD = readLine()!!.toInt()

    if((numA>numC&&numA>numD)||(numB>numC&&numB>numD)) print(true)
    else print(false)
}


/*Escrever um código que deve analisar quatro números inteiros e, caso numA
seja maior que numC e numD ou caso numB seja maior que numC e numD,
retornar true, caso contrário, retornar false.*/