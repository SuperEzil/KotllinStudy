package study

/**
 * TODO
 *  Override & Interface
 *
 */
fun main() {

        val family1 = Parent("papa", 1)
        val family2 =  Child("Johon", 2, "baby")

        family1.printInfo()
        family2.printInfo()
}

/**
 * TODO  부모 클래스
 *
 * @constructor
 * TODO
 *
 * @param name
 * @param age
 */
open class Parent(val name: String, val age: Int){
    var sequesce : Int = 1;
    init {
        println("Initializer block - Parent")
    }
    open fun printInfo(){
        println("name: $name ,age: $age ,sequnce: $sequesce")
    }

}

/**
 * TODO 자식 클래스
 *
 * @property nickName
 * @constructor
 * TODO
 *
 * @param name
 * @param age
 */
class Child(name: String, age: Int, val nickName: String) :Parent(name, age){
    init {
        println("Initializer block - Child")
        this.sequesce++
    }
    override fun printInfo() {
        println("name: $name ,age: $age ,sequence: ${sequesce}, nickName: $nickName")
    }
}
