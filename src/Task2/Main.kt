package Task2
fun main (){
    var array = arrayOf<Int>(11, 28 ,65 , 84 , 89 ,6 , 84 , 8)
    var maxVolume = array.maxOrNull()
    var minVolume = array.minOrNull()
    println("Максимальное занчение массива равно :${maxVolume}\n " +
            "Минимальное значение массива равно : ${minVolume} ")
}
