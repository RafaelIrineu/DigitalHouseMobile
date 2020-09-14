fun main(){
print("Informe a primeira média parcial: ")
    var avg1 = readLine()!!.toInt()
    print("Informe a segunda média parcial: ")
    var avg2 = readLine()!!.toInt()
    var result = (avg1+avg2)/2
    if(result>=7&&result<10){
        print("Aprovado")
    }
    else if(result==10){
        print("Aprovado com Distinção")
    }
    else if(result<7&&result>=0){
        print("Reprovado")
    }
    else
        print("Não é possível ter uma média inferior a 0 ou maior do que 10, revise suas notas.")
}