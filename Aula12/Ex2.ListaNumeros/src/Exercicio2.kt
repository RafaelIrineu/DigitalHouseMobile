fun main(){

    var listaNumeros = mutableListOf<Int>()
    listaNumeros.add(1)
    listaNumeros.add(5)
    listaNumeros.add(5)
    listaNumeros.add(6)
    listaNumeros.add(7)
    listaNumeros.add(8)
    listaNumeros.add(8)
    listaNumeros.add(8)

    println(listaNumeros)

    var setNumeros = mutableSetOf<Int>()
    setNumeros.add(1)
    setNumeros.add(5)
    setNumeros.add(5)
    setNumeros.add(6)
    setNumeros.add(7)
    setNumeros.add(8)
    setNumeros.add(8)
    setNumeros.add(8)

    println(setNumeros)

    //a diferença foi que o set não aceita valores repetidos.

    println()
    println("For Each da lista")

    listaNumeros.forEach{
        println(it)
    }

    println()
    println("For Each do set")

    setNumeros.forEach{
        println(it)
    }
}