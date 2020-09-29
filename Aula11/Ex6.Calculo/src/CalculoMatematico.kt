class CalculoMatematico {
    fun divisao(num1: Int, num2: Int) {
            if(num2==0){
                throw ArithmeticException("O divisor não pode ser zero.")
            }
            num1 / num2
            return
        }
    }


/*try {
            num1 / num2
            return
        }catch(ex: java.lang.ArithmeticException){
            println("A operação não pode ser realizada. ${ex.message}")
            ex.printStackTrace()
        }*/