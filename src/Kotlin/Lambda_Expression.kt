package Kotlin

fun main(){

    //lambda expression which has no name only parameters and body

    val sum={a:Int,b:Int ->a+b}
    println(sum(2,5))

    val subtrack:(Int)->Int={a->a-a}
    println(subtrack(10))

    val  multi:(Int,Int) ->Int ={a ,b-> a*b}
    println(multi(5,4))
}