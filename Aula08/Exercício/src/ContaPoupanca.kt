class ContaPoupanca(
    conta: Int, saldo: Double,
    private val limite: Double) : ContaBancaria(conta, saldo)    {

    override fun sacar(valor: Double): Boolean {
        return if (valor > (saldo + limite)) {
            println("Saldo insuficiente.")
            false
        } else {
            saldo -= valor
            return true
        }
    }

    override fun depositar(valor: Double): Boolean {
        saldo += valor
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: $limite")
    }
}