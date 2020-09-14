fun main(){
    print("Informe uma letra: ")
    var word = readLine()!!.toUpperCase()
    if(word=="F"){
        print("F - Feminino")
    }
    else if(word=="M")
        print("M - Masculino")
    else{
        print("Sexo inválido")
    }
}