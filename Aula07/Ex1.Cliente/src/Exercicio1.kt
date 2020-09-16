fun main() {
    var cliente1 = Cliente("Rafael", "Irineu")
    var cliente2 = Cliente("Costa", "Oliveira")

    val conta1 = Conta(1, 500.0, cliente1)
    val conta2 = Conta(2, 0.0, cliente2)

    conta1.depositar(200.0)
    conta1.sacar(100.0)

    conta2.depositar(200.0)
    conta2.sacar(100.0)

}
