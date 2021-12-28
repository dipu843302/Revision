package Kotlin

fun main(){
  val a=Sum.sum(5)
    println(a)


}
class Sum(){
    companion object {

        @JvmOverloads
        fun sum(a: Int, b: Int = 10): Int {
            return a + b
        }
    }
}