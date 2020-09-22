class CalculoMatematico {
    fun divisao(num1: Int, num2: Int) {
        try {
            num1 / num2
            return
        }catch(ex: java.lang.ArithmeticException){
            println("A operação não pode ser realizada. ${ex.message}")
            ex.printStackTrace()
        }
    }
}