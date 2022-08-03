fun iter(seq:Sequence<String>){
    for (t in seq) print("$t, ")
}

fun main(args: Array<String>) {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings
        .asSequence()
        .filter { println("filter($it)"); it.title.endsWith("g") }
        .map { println("map($it)");it.title }

    print("Filtered Meeting Titles: ")
    //for (t in titles) print("$t, ")
    iter(titles)

    //terminal and non-terminal operations

//    val title=meetings
//        .asSequence()
//        .map{ println("map($it)");it.title.toUpperCase()}
//        .find {; it.startsWith("BOARD") }
//
//    println(title)
}

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Sam"), Person("Alex"))
}

data class Person(val name: String) {}