class Banco : Imprimível {
    var contas = ArrayList<ContaBancaria>()

    fun adicionarConta(conta: ContaBancaria) {
        contas.add(conta)
        println("Conta adicionada")
    }

    fun removerConta(conta: ContaBancaria) {
        contas.remove(conta)
        println("Conta removida")
    }

    fun procurarConta(numero: Int): ContaBancaria? {
        if (numero in 0 until contas.size) {
            return contas[numero]
        } else {
            return null
        }
    }

    override fun mostrarDados() {
        contas.forEach { it.mostrarDados() }
    }

}