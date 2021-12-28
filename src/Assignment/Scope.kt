package Assignment

data class Scope(var age:Int, var name:String)

fun main() {
   val scope=Scope(10,"anil")

    scope.let {
       it.age=10
        it.name="anil"
    }
    scope.apply {
        age=10
        name="anil"
    }
    with(scope){
        age=10
        name="anil"
    }
    scope.also {
        it.age=22
        it.name="anil"
    }
    scope.run {
        age=33
        name="anil"
    }

}