fun main() {
    var height = arrayOfNulls<Float>(5)

    for (i in 0..4) {
        print("Informe a " + (i+1) + "ª altura: ")
        height[i] = readLine()!!.toFloat()
    }
    height.reverse()
    println("As alturas são: ")
    for (i in 0..4) {
        println("" + height[i]+ " m")
    }
}

/*Faça um Programa que peça a altura de 5 pessoas, armazene cada informação
num array. Imprima a altura na ordem inversa a ordem lida.*/