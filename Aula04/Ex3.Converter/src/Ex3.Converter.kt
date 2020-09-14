fun main() {
    print("Informe o número em metros (sem a unidade): ")
    var numberCm = readLine()!!.toInt()
    var numberM = numberCm*100
    print("$numberCm cm equivale a $numberM m")
}