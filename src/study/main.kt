package study

fun main(args : Array<String>) {
    println("Hello Word!!")
    println("fun sum (1,2):"+ sum(1,2))
    println("fun sum variable default value (1):" + sum(1))

}


fun sum(a:Int, b:Int = 10) : Int {
    return a+b
}