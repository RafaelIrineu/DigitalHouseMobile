fun main() {
    var yes = 0
    var no = 0
    println("Use apenas 'S' para sim e 'N' para não")
    print("Telefonou para a vítima? ")
    var q1 = readLine()!!.toUpperCase()
    if(q1.equals("S")) {
        yes += 1
    }
    else{
        no += 1
    }
    print("Esteve no local do crime? ")
    var q2 = readLine()!!.toUpperCase()
    if(q2.equals("S")) {
        yes += 1
    }
    else{
        no += 1
    }
    print("Mora perto da vítima? ")
    var q3 = readLine()!!.toUpperCase()
    if(q3.equals("S")) {
        yes += 1
    }
    else{
        no += 1
    }
    print("Devia para a vítima? ")
    var q4 = readLine()!!.toUpperCase()
    if(q4.equals("S")) {
        yes += 1
    }
    else{
        no += 1
    }
    print("Já trabalhou com a vítima? ")
    var q5 = readLine()!!.toUpperCase()
    if(q5.equals("S")) {
        yes += 1
    }
    else{
        no += 1
    }
    if(yes==2){
        print("Você é suspeito(a)")
    }
    else if(yes==3||yes==4){
        print("Você é cúmplice!")
    }
    else if(yes==5){
        print("Você é o(a) assassino(a)!")
    }
    else{
        print("Você é inocente")
    }
}