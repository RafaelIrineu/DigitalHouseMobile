class Banco : Imprimível {
    var contas = ArrayList<ContaBancaria>()

    fun adicionarConta(conta: ContaBancaria) {
        contas.add(conta)
        println("Conta adicionada!")
    }

    fun removerConta(conta: ContaBancaria) {
        contas.remove(conta)
        println("Conta removida")
    }

    fun procurarConta(numero: Int): ContaBancaria? {
        for (conta in contas) {
            if (conta.numeroDaConta == numero){
            return conta
        }
    }
        return null //pq??
    }

    override fun mostrarDados() {
        contas.forEach { it.mostrarDados() }
    }

}