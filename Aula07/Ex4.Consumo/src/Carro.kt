class Carro(var consumo: Int) {

    var tanque: Int = 0

    fun andar(distancia: Int) {

        if ((distancia / consumo) > tanque) {
            println("Sem combustível.")
        } else {
            tanque -= (distancia / consumo)
            println("Anda $distancia quilômetros.")
        }
    }

    fun obterGasolina() {
        println("O nível de combustível é: $tanque")
    }

    fun adicionarGasolina(quantidade: Int) {
        tanque += quantidade
        println("Abasteceu com $quantidade litros de combustível.")
    }
}