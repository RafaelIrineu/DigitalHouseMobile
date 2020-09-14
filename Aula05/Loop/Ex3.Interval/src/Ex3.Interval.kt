fun main() {
    println("Informe dois números inteiros para receber os números no intervalo entre eles.")
    print("Informe o primeiro número: ")
    var num1 = readLine()!!.toInt()
    print("Informe o segundo número: ")
    var num2 = readLine()!!.toInt()
    print("Os números entre $num1 e $num2 são: ")
    if (num1 < num2) {
        for (count in num1 until num2) {
            println(count)
        }
    } else {
        for (count in num1 until num2) {
            println(count)
        }
    }
}