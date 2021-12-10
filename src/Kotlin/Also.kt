package Kotlin

class Also {
    var name="Dipu"
}
fun main(){
    val numbersList:MutableList<Int> = mutableListOf(1,2,3)

    numbersList.also {
        println(it)
        it.add(5)
        println(it)
        it.remove(2)
        println(it)
    }
    var al=Also()
    al.also {
        it.name="Kumar"
        println(it.name)
    }
}