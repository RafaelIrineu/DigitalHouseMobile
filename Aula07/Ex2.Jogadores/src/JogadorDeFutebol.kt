class JogadorDeFutebol(var nome: String, var energia: Double, var alegria: Double, var gols: Int, var experiencia: Double) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }
}