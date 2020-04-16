package study

/**
 * TODO 데이터 클래스
 * 앞에 data 로 명시를 하면 기본적은 toString(), equals(), hashCode() 등을 자동 오버라이딩한다.
 *
 * @property name
 * @property postalcode
 */
data class dClient(val name:String, val postalcode:Int){

}

class cClient(val name:String, val postalcode:Int){

}

fun main(){
    val dClass1  = dClient("Data",1234)
    var dClass2  = dClient("Data",1234)
    println("Data Class 1: ${dClass1}")
    println("Data Class equals 1: ${dClass1 == dClass2}")
    println("Data Class equals 2: ${dClass1.equals(dClass2)}")
    dClass2 = dClass1.copy(name ="Copy Data")
    println("Data Class 3 Copy: ${dClass2}")

    val cClass = cClient("Class",4321)
    println("Basic Class: ${cClass}")
}