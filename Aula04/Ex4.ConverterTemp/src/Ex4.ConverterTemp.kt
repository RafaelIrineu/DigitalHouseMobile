fun main(){
    print("Informe a temperatura em graus Celsius (sem o º): ")
    var tempC = readLine()!!.toInt()
    var tempF = (tempC*9/5)+32
    print("$tempC ºC equivalem a $tempF ºF")
}