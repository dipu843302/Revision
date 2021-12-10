package Kotlin

class Let {
    var name=""
    var age=null
}
fun main(){
    var let=Let()
    println(let.age)
    println(let.name)

    Let().let {
        println(it.age)
        println(it.name)
    }

    val address: String? ="value"

   val strLen= address?.let {
        println(it.capitalize())
        it.length
    }
    println(strLen)
}