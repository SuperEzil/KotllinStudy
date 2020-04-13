package study

interface Show{
    fun show()
    fun print() = println("Show Print")
    fun showOff() = println("Show ShowOff")
}

interface Listner{
    fun check()
    fun print() = print("listner Print")
    fun select(boolean: Boolean) = println("Select : ${if (boolean) "O" else "X"}")
    fun showOff() = println("listner ShowOff")
}

fun main(){
    val textBox = TextBox()
    textBox.show()

    val strBox = StringBox()
    strBox.check()
    strBox.print()
    strBox.select(true)

    val docbox = DocBox()
    docbox.show()
    docbox.check()
    docbox.print()
    docbox.select(false)
    docbox.showOff()

    println(PrivateUser("ScretUer").nickName)
    println(SubscribngUser("aaa@facebook.com").getID())
    println(SubscribngUser("aaa@facebook.com").nickName)
    println(SubscribngUser("aaa@facebook.com").email)
}


class TextBox : Show{
    override fun show() {
        println("TextBox fun show")
    }
}

class StringBox : Listner{
    override fun check() = print("StringBox Check")

}


class DocBox:Show,Listner{
    override fun show() = print("DocBox Show")

    override fun check() = println("DocBox Check")
    override fun print() = println("Docbox Print")
    override fun showOff(){
        super<Show>.showOff()
        super<Listner>.showOff()
    }
}


interface User{
    val nickName :String
}

class PrivateUser(override val nickName: String) :User


class SubscribngUser(val email:String):User {
    override val nickName: String = getID()
    fun getID()=email.substringBefore("@")
}