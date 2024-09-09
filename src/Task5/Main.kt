package Task5

fun main(){
    var car0 = Car(50 , 900)
    var car1 = Car(0,9000)
    car0.action()
    car1.action()
}

class Car (var speed : Int , var mass : Int){
    fun action (){
        when {
            speed != 0 -> println("Автомобиль движется")
            speed == 0 -> println("Автомобиль стоит на месте")
        }
    }
}