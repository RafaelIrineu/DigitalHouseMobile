fun main(){
    var calculo = CalculoMatematico()
    try {
        calculo.divisao(4, 0)
    } catch (ex: java.lang.ArithmeticException){
        println("A operação não pode ser realizada. ${ex.message}")
        ex.printStackTrace()
    }
}