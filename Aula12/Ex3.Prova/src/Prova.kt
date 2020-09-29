class Prova() {
    var soma = 0
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        conjuntoDeInteiros.forEach{
            soma += it
        }
        println(soma)
    }
}