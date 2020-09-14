fun main(){
    print("Informe a sua altura: (formato 0.00): ")
    var height = readLine()!!.toDouble()
    var manWeight = (72.7*height)-58
    var womanWeight = (62.1*height)-44.7
    print("O peso ideal para homens é: $manWeight")
    print("O peso ideal para mulheres é: $womanWeight")
}