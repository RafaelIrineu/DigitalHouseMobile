fun main(){
    var number: Double = 0.00
    for (count in 1..5){
        print("Informe o "+count+"º número: ")
        var bigger = readLine()!!.toDouble()
        if(bigger>number){
            number=bigger
        }
    }
    print("O maior número informado foi: $number")
}