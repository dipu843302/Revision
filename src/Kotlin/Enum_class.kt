package Kotlin

fun main(){
val day=Day.Thursday
   // println(day)

    day.printDay()
    day.multi(10)
}

enum class Day(val number: Int){
    Sunday(1),Monday(1),
    Tuesday(1),Thursday(1),
    Friday(1),Saturday(1);

    fun printDay(){
        println("This is $this")
    }
    fun multi(a:Int){
        println(a*a)
    }
}