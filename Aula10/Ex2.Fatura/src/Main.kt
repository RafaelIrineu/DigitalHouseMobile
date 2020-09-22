fun main(){
    val fatura = Fatura()

    var item1 = Itens(1,"item 1", -2.0, 1)
    var item2 = Itens(2,"item 1", 2.0, -1)

    fatura.itens.add(item1)
    fatura.itens.add(item2)

    println(fatura.getTotalFatura())

}