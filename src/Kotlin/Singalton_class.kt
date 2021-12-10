package Kotlin

object Single{

        fun sub(a:Int,b:Int){
            println(a-b)
        }
        fun addition(a:Int,b:Int){
            println(a+b)
        }
}
fun main(){
    Single.sub(14,5)
    Single.addition(15,20)
}