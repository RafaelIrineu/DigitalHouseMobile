fun main(){

    val listaFuncionarios = arrayListOf<Funcionario>()

    val funcionario1 = Funcionario("Jose", 1)
    val funcionario2 = Funcionario("Joao", 2)
    val funcionario3 = Funcionario("Chico", 3)
    val funcionario4 = Funcionario("Jao", 4)

    val funcionario5 = Funcionario("Ze",4)

    println(listaFuncionarios.contains(funcionario5))

}