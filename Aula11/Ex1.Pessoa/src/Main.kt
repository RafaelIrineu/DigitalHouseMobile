fun main(){
    var pessoa1 = Pessoa("Rafael", 49018)
    var pessoa2 = Pessoa("Mariana", 49018)

    println(pessoa1 == pessoa2)

    //o primeiro, comparando as 2 variáveis, retornou false
    //o segundo, comparando apenas o RG, retornou true
    /*mudou porque da primeira vez estava comparando tod.o o objeto,
    e na segunda comparando apenas 1 dos atributos do objeto*/

}