fun main(){

    //var listaAlunos = arrayListOf<Aluno>()

    //outro método
    //var lista1 = Aluno("Rafael", 1)
    //listaAlunos.add(lista1)

    //outro método
    /*listaAlunos.add(Aluno("Rafael", 1))
    listaAlunos.add(Aluno("Rafa", 2))
    listaAlunos.add(Aluno("fael", 3))
    listaAlunos.add(Aluno("Rafael", 4))*/

    //outro método

    val alunos = arrayListOf(
        Aluno("Rafael", 1),
        Aluno("Rafa",2),
        Aluno("fael",3),
        Aluno("Rafael", 4))

    var aluno5 = Aluno("Irineu", 2)

    println(alunos.contains(aluno5))
}