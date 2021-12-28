package Kotlin


// lambda expression
var lambda = {println("GeeksforGeeks: A Computer Science portal for Geeks") }
var lambd = {println("Hey ..............") }
// higher-order function
fun higherfunc( lmbd: () -> Unit ) {	 // accepting lambda as parameter
    lmbd()							 //invokes lambda expression
}
fun main(args: Array<String>) {
    //invoke higher-order function
    higherfunc(lambda)				 // passing lambda as parameter
}
