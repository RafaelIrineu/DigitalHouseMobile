fun main() {

    val bolt = Atleta("Usain Bolt", 90, 80)
    val max = Atleta("Max Verstappen", 100, 100)

    val prova1 = Prova(50, 10)
    val prova2 = Prova(100, 50)
    val prova3 = Prova(101, 30)

    prova1.realizarProva(bolt)
    prova2.realizarProva(bolt)
    prova3.realizarProva(bolt)

    prova1.realizarProva(max)
    prova2.realizarProva(max)
    prova3.realizarProva(max)

}