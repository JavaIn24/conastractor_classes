package Task1

class Box  (var width : Int, var height : Int, ){
    private var depth : Int = 0
    constructor(width: Int, height: Int, depth : Int) : this (
        width, height ) {
        this.depth = depth
    }
    fun volume () : Int {
        val volume = width * height * depth
        return volume
    }

}