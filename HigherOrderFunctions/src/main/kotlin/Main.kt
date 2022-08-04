fun main(args: Array<String>) {
    doSomething(action)
    val result = calc(2, 5)
    println(result)

    val ints = listOf(1, 2, 3, 4, 5)
    val i = first(ints, { i -> i == 3 })
    println(i)

}

val action = { println("Hello, World") }

//val calc = { x: Int, y: Int -> x * y }
val calc: (Int, Int) -> Int = { x, y -> x * y }

fun doSomething(func: () -> Unit) {
    func()
}

inline fun <T> first(items: List<T>, predicate: (T) -> Boolean): T {
    for (item in items) {
        if (predicate(item)) return item
    }
    throw Exception()
}

//java -jar fernflower.jar out\production\HigherOrder\com\rsk\InliningKt.class .
//java -jar fernflower.jar out\production\HigherOrder\com\rsk\InliningKt.class .InlineKt.java