import rsk.Process
import rsk.Program
import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    var program = Program()
    var total = 0
    //program.fibonacci(8)
//    program.fibonacci(8, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })

//    program.fibonacci(8) { n ->
//        println(n)
//    }
    //program.fibonacci(8, { n -> println(n) })
    //program.fibonacci(8, { println(it) })
    //program.fibonacci(8, ::println)

//    program.fibonacci(8) { it -> total += it }
//
//    println(total)
    val m = Meeting()

//    m.Title = "Board Meeting"
//    m.When = Date(2017, 1, 1)
//    m.Who.add("Kevin")

    with(m) {
        Title = "Board Meeting"
        When=Date(2017, 1, 1)
        Who.add("Kevin")
    }
    m.apply {
        Title = "Board Meeting"
        When=Date(2017, 1, 1)
        Who.add("Kevin")
    }.create()

}