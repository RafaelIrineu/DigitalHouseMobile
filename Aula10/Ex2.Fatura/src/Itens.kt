import kotlin.math.max

class Itens constructor(val numero: Int, val descricao: String,
                        var precoUnitario: Double, var quantidade: Int) {

    init {
        quantidade = max(0,quantidade)
        precoUnitario = max(0.0,precoUnitario)
    }

}