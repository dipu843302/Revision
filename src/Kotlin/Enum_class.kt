package Kotlin

fun main(){
val day=Day.Monday
    println(day)

    day.printDay()
}

enum class Day(val number: Int){
    Sunday(1),Monday(1),
    Tuesday(1),Thursday(1),
    Friday(1),Saturday(1);

    fun printDay(){
        println("This is $this")
    }
}