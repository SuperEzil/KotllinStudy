package study

class Calculator{
    var lastResult:Int = 0

    fun sum(a:Int, b:Int)= a+b
    fun minus(a:Int, b:Int):Int{
        lastResult = a-b
        return lastResult
    }
}

var Calculator.signResult:Char
    get() = if (lastResult<0) '-' else '+'
    set(value) {}

fun Calculator.sum(a: Int,b: Int, c:Int) = sum(a,b)+c
fun Calculator.minus(a: Int) = -a
fun main(){
    var calculator = Calculator();

    println("1+2 = ${calculator.sum(1,2)}")
    println("1-2 = ${calculator.minus(1,2)}")

    println("Extension 1+2+1 = ${calculator.sum(1,2, 1)}")
    println("Extension -1 = ${calculator.minus(1)}")
    println("signResult = ${calculator.signResult}")
}
