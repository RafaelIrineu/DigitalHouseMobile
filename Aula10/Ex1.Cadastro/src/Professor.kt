class Professor(nome: String, registro: String): Pessoa(nome, registro) {

    override val darAula: Boolean
        get() = true

    override val fazerChamada: Boolean
        get() = true
}