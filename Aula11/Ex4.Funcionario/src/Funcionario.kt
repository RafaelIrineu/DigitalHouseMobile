class Funcionario(val nome: String, val nomeDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (nomeDeRegistro != other.nomeDeRegistro) return false

        return true
    }

    override fun hashCode(): Int {
        return nomeDeRegistro
    }
}