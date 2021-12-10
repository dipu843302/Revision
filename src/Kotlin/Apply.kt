package Kotlin

class Apply {
}
class Man(){
    var name=""
    var age=0
}
fun main(){

    val man=Man().apply {
        name="Dipu"
        age=22
    }
    with(man){
        println(age)
        println(name)
    }
}