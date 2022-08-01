
fun main(args: Array<String>) {
    display("Hello, Michael")
    println(max(1,3))
}

fun display(message: String): Boolean {
    println(message)
    return true
}

//Function Expressions
fun max(a: Int, b: Int): Int = if (a > b) a else b

//Default Parameters
