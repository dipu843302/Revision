package Kotlin

class With_Scope {

}
class Person(){
    var name="Dipu Kumar"
    var age=22
}
fun main(){
    // Simple code
    val person=Person()
//    println(person.age)
//    println(person.name)

    // with scope function
  var ageAfterYears=with(person){
      println(age)
      println(name)
      age+10

  }
    println("age after 5 year $ageAfterYears")
}