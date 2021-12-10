package Kotlin

fun main(){
val tile:Tile=Red("Masroom",25)
    val  points=when(tile){
        is Blue -> tile.points*2
        is Red -> tile.points*5
    }
    println(points)
}
sealed class Tile
class Red(val type:String,val points:Int): Tile()
class Blue(val points:Int): Tile()