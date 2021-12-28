package Kotlin


fun main(){
    val employee=Employee()

// ******** apply *******

    //Normal initialize
    employee.age=22
    employee.name="Ram"

    // Use apply
 var ans =employee.apply {
        age=22
        name="Ram"
    }
// ******** let *******

    //normal print
 println(employee.age)
 println(employee.name)

    // Use let

    employee.let {
        it.age=50
        println(it.name)
        println(it.age)
    }
    // Use with

    with(employee){
        age=22
        name="Ram"
        println(age)
    }

    // use run
    employee.run {
        age=20
        name="Hari"
    }


}
data class Employee(var name:String="",var age:Int=23)
