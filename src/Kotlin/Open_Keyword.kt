package Kotlin



open class MindOrks {
    //use open keyword to allow child class to override it
    open fun courseName(){
        println("Course Name")
    }
}

class AndroidPro : MindOrks(){
    //use the override keyword to override the function
    override fun courseName() {
        println("Android for Professionals")
    }


}
fun main(){
    val mindOrks=MindOrks()
    val androidPro=AndroidPro()
    println(androidPro.courseName())
    println("\n")
    println(mindOrks.courseName())

}