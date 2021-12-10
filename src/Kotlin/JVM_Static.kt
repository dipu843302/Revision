package Kotlin

class JVM{
    companion object  {
        @JvmStatic
        fun multi(a: Int, b: Int): Int {
            return a * b
        }
    }
}
fun main(){
    println(Static.Name())
}