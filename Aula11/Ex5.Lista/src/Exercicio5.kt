fun main() {
    try {
        val lista = arrayListOf<String>()

        lista.add("Pato")
        lista.add("Cachorro")
        lista.add("Gato")

        println(lista[3])
    } catch (ex: Exception) {
        println("Q q aconteceu?: ${ex.message}")
        ex.printStackTrace()
    }
}