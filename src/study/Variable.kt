package study

/**
 * TODO
 *  Variable & Constructor
 */
fun main(){
    var person = Person("ezil", 30)

    println(person.name)
    println(person.age)

    var buuton1 = Button(10)
    var button2 = Button(20, "buttons")

    println("Buttn(${buuton1._id}): ${buuton1.text}")
    println("Buttn(${button2._id}): ${button2.text}")
}

/**
 * TODO
 * 사용자 정보
 * @property name 이름
 * @property age 나이
 * Primary Constructor
 */
class  Person(var name : String, var age : Int)


/**
 * TODO
 * 버튼 생성자 정의
 * Secondary Constructor
 */
class Button{
    var _id : Int = -1
    var text : String =""

    /**
     * initializer Block - 복수 선언 가능
     * 디폴트 값 정의도 가능하지만 초기화 블럭은 값 초기화외에 추가적인 작업이 가능함.
     */
    init {
        println("Initializer Block - ${this.javaClass.name} : id: $_id")
    }

    constructor(id:Int){
        this._id = id
        println("Primary constructor- ${this.javaClass.name} : id: $_id")

    }

    constructor(id: Int, text: String){
        this._id =id
        this.text = text
        println("Secondry constructor - ${this.javaClass.name} : id: $_id ,text: $text")
    }
}