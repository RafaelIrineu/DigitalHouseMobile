class ContaCorrente(
    conta: Int,
    saldo: Double, private var taxaDeOperacao: Double) : ContaBancaria(conta, saldo) {

    override fun sacar(valor: Double): Boolean {

        return if (valor > saldo) {
            println("Saldo insuficiente")
            false
        } else {
            saldo -= valor
            return true
        }
    }

    override fun depositar(valor: Double): Boolean {
        return if ((valor + saldo) >= taxaDeOperacao) {
            saldo += valor - taxaDeOperacao
            true
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