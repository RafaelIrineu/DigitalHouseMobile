class Aluno(nome: String, val sobrenome: String, registro: String) : Pessoa(nome, registro) {

    override val assistirAula: Boolean
        get() = true

    override val fazerLicao: Boolean
        get() = true

}