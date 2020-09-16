fun main() {

    val jogador1 = JogadorDeFutebol("Neymar", 50.0, 50.0, 250, 50.0)
    val jogador2 = JogadorDeFutebol("Ronaldo", 50.0, 50.0, 500, 90.0)

    val treinarJogador = SessaoDeTreinamento(1.0)

    treinarJogador.treinarA(jogador1)
    treinarJogador.treinarA(jogador2)

}