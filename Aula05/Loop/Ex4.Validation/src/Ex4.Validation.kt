fun main(){
    var validate = false
    while(!validade){
        println("Informe seu nome: ")
        var name = readLine()!!.toString()
        if(name.length>3){
            validate=true
        }
    }
}