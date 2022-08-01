import java.io.FileReader
import java.io.IOException
import java.util.*

fun main(args: Array<String>) {
    useExceptions()
}

class Question {
    var Answer: String? = null
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> print("You were correct")
            else -> print("Try again?")

        }
    }
}

fun useQuestion() {
    println("Michael Bruno")
    val q: Question = Question()
    q.Answer = "42"
    q.display()
    println("The answer to the question '${q.Question}' is ${q.Answer}")
    val message = if (q.Answer == q.CorrectAnswer) "You were correct" else "Try again?"
    println(message)

    q.printResult()

    val number: Int? = try {
        Integer.parseInt(q.Answer)
    } catch (e: NumberFormatException) {
        null
    }
    println("Number is $number")
}

fun useLoops() {
    var numbers = listOf(1, 2, 3, 4, 5)
    for (i in 1..10) {
        println(i)
    }
    for (i in numbers) {
        println(i)
    }
    //half closed range
    for (i in 1 until 10) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages) {
        println("$name: $age")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    var range = 'a'..'z'
    for ((index, element) in range.withIndex()) {
        println("$element at $index")
    }
}

fun useExceptions() {
    var reader = FileReader("filename")
    try {
        reader.read()
    } catch (e: IOException) {
        println(e.message)
    } finally {
        println("Exited the filereader")
    }

}