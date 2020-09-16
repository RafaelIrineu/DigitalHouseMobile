class Prova(var dificuldade: Int, var energiaNecessaria: Int) {

    fun realizarProva(atleta: Atleta) {

        if (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            println(true)
            atleta.energia -= energiaNecessaria
        } else println(false)

    }
}