fun main() {
    print("Informe a quantidade de notas a serem calculadas: ")
    var count = readLine()!!.toInt()
    var grades = 0.00
    var avg = 0.00
    for (num in 1..count) {
        print("Informe sua nota: ")
        grades += readLine()!!.toDouble()
    }
    avg = grades / count
    print("A média das notas é: $avg")
}