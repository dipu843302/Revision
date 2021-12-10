package Kotlin


class EventManager {

    companion object  {
       fun add(a:Int,b:Int){
           println(a+b)
       }
    }
}
fun  main(){
    EventManager.add(5,1)
}