package study


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
 */
class  Person(var name : String, var age : Int)


/**
 * TODO
 * 버튼 생성자 정의
 */
class Button{
    var _id : Int = -1
    var text : String =""

    constructor(id:Int){
        this._id = id
    }

    constructor(id: Int, text: String){
        this._id =id
        this.text = text
    }
}