package study

/**
 * TODO
 *
 */
open class Rectangle{
   var height:Int = 0
    get() = field
    set(value) {
        field =value
    }

   var width:Int = 0
    get() = field
    set(value) {
        field = value
    }

    val isSquare: Boolean
    get() = height == width
}

class Rectangle2 : Rectangle {

    constructor() : super()

    constructor(height:Int, width : Int ){
        this.height = height
        this.width = width
    }
}

fun main(){
    val rect = Rectangle()
    rect.height=10
    rect.width=20

    println("height: ${rect.height}, width: ${rect.width}, Square: ${rect.isSquare}")

    val rect2 = Rectangle2(10,10)
    println("Rectangle2 height: ${rect2.height}, width: ${rect2.width}, Square: ${rect2.isSquare}")

    val rect3 = Rectangle2(20,10)
    println("Rectangle3 height: ${rect3.height}, width: ${rect3.width}, Square: ${rect3.isSquare}")

}
