class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (rg != other.rg) return false

        return true
    }

    override fun hashCode(): Int {
        return rg
    }
}