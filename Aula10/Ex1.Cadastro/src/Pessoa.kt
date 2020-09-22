abstract class Pessoa(var nome: String, var registro: String) {

    open val darAula get() = false
    open val fazerChamada get() = false
    open val assistirAula get() = false
    open val fazerLicao get() = false
}