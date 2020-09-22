class Fatura() {
    val itens = ArrayList<Itens>()

    fun getTotalFatura(): Double{
        var total = 0.0

        itens.forEach{
            total += it.quantidade * it.precoUnitario
        }
        return total
    }
}