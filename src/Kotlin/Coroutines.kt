package Kotlin
    fun main(){
        println("start ${Thread.currentThread().name}")

        Thread{
            println("A thread start ${Thread.currentThread().name}")
            Thread.sleep(2000)
        }
        println("end ${Thread.currentThread().name}")
    }
