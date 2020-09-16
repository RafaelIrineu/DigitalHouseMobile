class Conta(val numero: Int, var saldo: Double, val titular: Cliente) {

    fun depositar(quantia: Double) {
        saldo += quantia
        println("Depósito efetuado. O novo saldo é: R$ $saldo")
    }

    fun sacar(quantia: Double) {
        if (quantia > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= quantia
            println("Saque efetuado. O novo saldo é: R$ $saldo")
        }
    }
}