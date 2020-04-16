package study

/**
 * TODO
 *
 */
class Rectangle{
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
}

fun main(){
    val rect = Rectangle()
    rect.height=10
    rect.width=20

    println("height: ${rect.height}, width: ${rect.width}")


}
