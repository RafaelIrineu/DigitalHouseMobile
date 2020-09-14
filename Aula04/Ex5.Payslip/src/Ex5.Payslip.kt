fun main(){
    print("Informe o seu salário por hora: ")
    var hourSalary = readLine()!!.toInt()
    print("Informe quantas horas você trabalhou no mês: ")
    var hoursMonth = readLine()!!.toInt()
    var salary = hourSalary*hoursMonth
    var inss = salary*0.11
    var ir = salary*0.08
    var syndicate = salary*0.05
    var received = salary-inss-ir-syndicate
    println("+ Salário Bruto: R$ $salary")
    println("- IR (11%): R$ $ir")
    println("- INSS (8%): R$ $inss")
    println("- Sindicato (5%): R$ $syndicate")
    println("- Salário Líquido : R$ $received")
}