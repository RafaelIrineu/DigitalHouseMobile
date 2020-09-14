fun main(){
    print("Informe o número a ser calculado: ")
    var number = readLine()!!.toInt()
    for(count in 1..10){
        var result = count*number
        println("$count x $number = $result")
    }
}