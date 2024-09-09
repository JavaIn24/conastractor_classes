package Task3
fun  main () {
    var array = arrayOf<Int>(3, 67, 1, 55, 65, 89, 23)
    for (i in array.indices){
        println(array[i])
    }
    println(array.contentToString())
}
