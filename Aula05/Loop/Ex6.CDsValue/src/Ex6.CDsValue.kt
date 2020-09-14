fun main(){
    print("Informe a quantidade de CDs: ")
    var amount = readLine()!!.toInt()
    var value = 0.00
    var average = 0.00
    for(i in 1..amount){
        print("Informe o valor do "+i+"º CD: R$ ")
        value += readLine()!!.toInt()
    }
    average = value/amount
    println("O valor total gasto foi de: R$ $value")
    print("O valor médio gasto por CD foi de: R$ $average")
}