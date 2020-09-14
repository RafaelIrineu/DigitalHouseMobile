fun main(){
    print("Digite a nota 1: ")
    var grade1 = readLine()!!.toInt()
    print("Digite a nota 2: ")
    var grade2 = readLine()!!.toInt()
    print("Digite a nota 3: ")
    var grade3 = readLine()!!.toInt()
    print("Digite a nota 4: ")
    var grade4 = readLine()!!.toInt()
    var average = (grade1+grade2+grade3+grade4)/4
    print("A média é: $average")
}