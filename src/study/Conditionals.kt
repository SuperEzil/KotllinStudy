package study

fun getLarger(a:Int, b:Int): Int = if (a< b) b else a

fun getLarger2(a:Int, b:Int): Int{
    return if (a < b) {
        println("b bigger than a")
        b
    }else{
        println("a bigger than b")
        a
    }
}

fun printValue(a:Int, str:String="0"){
    when(a){
        1 -> println("value: 1")
        2 -> println("value: 2")
        3,4 -> println("value: 3 or 4")
        str.toInt() -> println("str is a")
        in 10..20 -> println("a is in the range 10~20")
        else -> println("none of th above")
    }
}

fun hasPrefix(x:Any) = when(x){     // Any : 타입 미정의
    is String -> x.startsWith("prefix")     // is : Smart Cast 타입 검사 후 자동 캐스팅
    else -> false
}


fun main(){
    println(getLarger(1,2))
    println(getLarger2(1,2))

    printValue(0)
    printValue(1)
    printValue(2)
    printValue(3)
    printValue(5)
    printValue(10,"10")
    printValue(10,"20")
}