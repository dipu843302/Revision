package Kotlin

fun main(){
    val a=10
    val b=5
    val c=a greater b

    println(c)

}

infix fun Int.greater(a:Int): Int {
    if (this>a)return this
    else
        return a
}