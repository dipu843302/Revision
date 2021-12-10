package Kotlin

fun main(){
    val x =10
    val y=15
    val greater= x.greaterValue(y)
    println(greater)

    println("Hello friend".formateString())

    val sub=x.subtract(10)
    println(sub)
}

fun Int.greaterValue(other:Int): Int {
  if (this>other)
      return this

    return other
}

fun String.formateString():String{
    return ".............\n$this\n..........."
}

fun Int.subtract(b:Int):Int{
    return this-b;
}