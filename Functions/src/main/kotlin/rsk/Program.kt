@file:JvmName("DisplayFunctions")

package rsk

fun main(args: Array<String>) {
    //Named parameters
    log(message = "Hello, Michael", logLevel = 2)
}

@JvmOverloads
//Default Parameters
fun log(message: String, logLevel: Int = 1): Boolean {
    println(message + logLevel)
    return true
}

//Function Expressions
fun max(a: Int, b: Int): Int = if (a > b) a else b



