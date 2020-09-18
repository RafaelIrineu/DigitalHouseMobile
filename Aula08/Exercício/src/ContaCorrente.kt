class ContaCorrente(
    conta: Int,
    saldo: Double, private var taxaDeOperacao: Double) : ContaBancaria(conta, saldo) {

    override fun sacar(valor: Double): Boolean {

        if (valor > saldo) {
            println("Saldo insuficiente")
            return false
        } else {
            saldo -= valor - taxaDeOperacao
            return true
        }
    }

    override fun depositar(valor: Double): Boolean {
        if ((valor + saldo) >= (taxaDeOperacao + saldo)) {
            saldo += valor - taxaDeOperacao
            return true
        } else {
            println("Quantia insuficiente.")
            return false
        }
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: $taxaDeOperacao")
    }
}