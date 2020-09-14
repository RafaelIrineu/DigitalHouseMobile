fun main(){
    print("Informe o seu salário por hora: ")
    var hourSalary = readLine()!!.toInt()
    print("Informe quantas horas você trabalhou no mês: ")
    var hoursMonth = readLine()!!.toInt()
    var salary = hourSalary*hoursMonth
    print("Seu salário é: R$ $salary")
}