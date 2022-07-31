fun main(args: Array<String>) {
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