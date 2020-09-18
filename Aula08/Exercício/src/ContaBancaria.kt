abstract class ContaBancaria(protected val conta: Int, protected var saldo: Double) : Imprimível {

    abstract fun sacar(valor: Double): Boolean
    abstract fun depositar(valor: Double): Boolean

    override fun mostrarDados() {
        println("-----------------")
        println("Conta: $conta")
        println("Saldo: $saldo")

    }

    fun transferir(valor: Double, destino: ContaBancaria) {
        var saldoContaOrigem = saldo
        if (!sacar(valor) || !destino.depositar(valor)) {
            saldo = saldoContaOrigem
            println("Operação cancelada")
        }
    }
}