package study.Nullable

class Bitmap(val width:Int, val height:Int){
    val size: Int
        get() = width*height
    val map =ByteArray(size)
}

fun CreateBitmap(width: Int, height: Int): Bitmap? {        // '?' Null 허용
    if(width>0 && height > 0) return Bitmap(width, height) else return null
}

fun DrawBitmap(bitmap: Bitmap){
    println("DrawBitmap")
}

/**
 * TODO 코틀린은 컴파일 과정에서 모든 널을 방지
 *  단, Java가 Null을 허용하여, 같이 사용하거나, 로직 및 논리적으로 Null이 필요한 경우
 *  명시적으로 허용하여 사용이 가능하다.
 *
 */
fun main(){
    var bitmap: Bitmap? = CreateBitmap(10, 10)
    println("Safe Calls ${bitmap?.size}")   // Null 체크와 프로퍼티 접근은 한번에 처리해주는 접근자

    if (bitmap != null) {
        println(bitmap.size)
    }

    val person = Person("Name", null)
    println("Person Company null : cityname ${person.cityName()}")
    println("Person Company null : cityname2 ${person.cityName2()}")

    person.company?.addr?.city  = "Seoul"       // Company가 null 임으로 city에 데이터 입력 단계가 진행되지 않는다.
    println("Person Company null : cityname3 ${person.cityName3()}")
    println("Person Company null : cityname4 ${person.cityName4()}")

    bitmap?.let {
        DrawBitmap(it)      // it은 매개 변수가 한개일 경우 이름 대신에 사용 가능한 키워드 이다.
    }

    println(bitmap!!.size) // 절대 Null 발생 제외 키워드 #. 실제로 Null이 발생하여도 NullpointException이 발생하지 않음으로 사용상의 주의가 필요함. 해당 키워드 사용 후 하단의 모든 항목도 적용된다.
    DrawBitmap(bitmap)

}


class Address(val st:String, val zipCode:Int, var city:String)
class Company(val name:String, val addr: Address?)
class Person(val name:String, val company: Company?)


fun Person.cityName(): String{
    val address = this.company?.addr
    val city = address?.city

    return if (city != null) city else "Unkonw"

}

fun Person.cityName2(): String{
    val city = this.company?.addr?.city     // 체인 방식
    //return if (city != null) city else "Unkonw"
    return city?:"Unkonw"  // Elvis 연산자 Null 인 경우 정의된 값을 반환한다.
}

fun Person.cityName3(): String{
    return this.company?.addr?.city?:"Unkonw"
}

fun Person.cityName4(): String = this.company?.addr?.city?:"Unkonw"
