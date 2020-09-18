class ContaPoupança(
    conta: Int, saldo: Double,
    private val limite: Double) : ContaBancaria(conta, saldo) {

    val credito: Double = 0.0

    override fun sacar(valor: Double): Boolean {
        if (valor > (saldo + limite)) {
            println("Saldo insuficiente.")
            return false
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