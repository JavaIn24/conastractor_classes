package Task4
fun main () {
    var number0 = Number(6)
    var number1 = Number(-4)
    var number2 = Number(5)
    var number3 = Number(-9)
    var number4 = Number(0)
    number0.numberInf0()
    number1.numberInf0()
    number2.numberInf0()
    number3.numberInf0()
    number4.numberInf0()


}

class Number (var n : Int) {
    fun numberInf0 () {
        when {
            n > 0 && n % 2 == 0 -> println("n = $n положительное четное число")
            n < 0 && n % 2 == 0 -> println("n = $n отрицательное четное число")
            n > 0 && n % 2 != 0 -> println("n = $n положительное нечетное число")
            n < 0 && n % 2 != 0 -> println("n = $n отрицательное нечентное число")
            n == 0 -> println("n = $n нулевое число")

        }
    }
}

