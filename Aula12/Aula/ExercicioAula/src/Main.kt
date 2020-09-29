fun main() {

    val pessoa1 = Pessoa("Rafael", Estado("SP", "São Paulo"))
    val pessoa2 = Pessoa("Rafa", Estado("MG", "Minas Gerais"))
    val pessoa3 = Pessoa("Fael", Estado("SP", "São Paulo"))
    val pessoa4 = Pessoa("Irineu", Estado("MG", "Minas Gerais"))

    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4)

    //ou val pessoas = arrayListOf(pessoa1, pessoa2, pessoa3, pessoa4)

    val pessoasPorEstado = mutableMapOf<Estado, MutableList<Pessoa>>()

    println(pessoas.groupBy { it.estado.nome })
}

/*pessoas.forEach {
        if (!pessoasPorEstado.containsKey(it.estado)) {
            //inicializa o list
            pessoasPorEstado[it.estado] = mutableListOf()
        }
        pessoasPorEstado[it.estado]?.add(it)
    }

    println(pessoasPorEstado)*/ //resumir por groupBy


/*val lista = setOf("hehehehe","hahahah")
    println(lista.iterator().next())

    var iterator = lista.iterator()

    while(iterator.hasNext()){
        println(iterator.next())
    }*/