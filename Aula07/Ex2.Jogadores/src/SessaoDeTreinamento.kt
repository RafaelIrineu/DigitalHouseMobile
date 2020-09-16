class SessaoDeTreinamento(var experiencia: Double) {

    fun treinarA(jogador: JogadorDeFutebol) {
        println("Experiência inicial: ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        experiencia += 1
        jogador.experiencia += experiencia
        println("Experiência final: ${jogador.experiencia}")
    }
}