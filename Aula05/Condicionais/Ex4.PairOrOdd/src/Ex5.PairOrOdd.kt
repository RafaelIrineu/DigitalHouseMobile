fun main(){
    print("Informe um número: ")
    var number = readLine()!!.toInt()
    if(number%2==0){
        print("O número $number é um número par")
    }
    else{
        print("O número $number é um número ímpar")
    }
}