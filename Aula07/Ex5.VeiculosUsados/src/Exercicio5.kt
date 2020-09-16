fun main() {

    val topVeiculos = Concessionaria("Top Veículos")
    val monza = Veículo("Chevrolet", "Monza", 1986, "Cinza", 100000)
    val rafael = Cliente("Rafael", "Irineu", 9999999)
    val venda1 = Venda(20000.0, monza, rafael)

    topVeiculos.registrarVenda(venda1)

}