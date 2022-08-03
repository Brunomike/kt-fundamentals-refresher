fun main(args: Array<String>) {
    var ints = listOf(1, 2, 3, 4, 5)

    var smallInts = ints.filter { it < 4 }

    print("Filter: ")
    for (i: Int in smallInts) print("$i ")
    println("")

    val squaredInts = ints.map { it * it }

    print("Map: ")
    for (i: Int in squaredInts) print("$i ")
    println("")

    val smallSquaredInts = ints
        .filter { it < 5 }
        .map { it * it }

    print("Filter and Map: ")
    for (i: Int in smallSquaredInts) print("$i ")
    println("")

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings
        .filter { it.title.startsWith("C") }
        .map { it -> it.title }

    print("Filtered Meeting Titles: ")
    for (t in titles) print("$t, ")
    println("")

    //Predicate -Lambdas that return a boolean e.g all, any, count, find
    val greaterThanThree = { v: Int -> v > 3 }

    var largeInts = ints.all { it > 6 }
    println("Are all large ints?: $largeInts")

    largeInts = ints.any(greaterThanThree)
    println("Is any a large int?: $largeInts")

    var numberOfLargeInts = ints.count(greaterThanThree)
    println("Large ints count: $numberOfLargeInts")

    var found = ints.find(greaterThanThree)
    //returns null of none is found
    println("First Element found: $found")

    val people = meetings
        .flatMap { it -> it.people }
        .distinct()

    print("Meeting attendance: ")
    for (p in people) print("${p.name}, ")
}


class Meeting(val id: Int, val title: String) {
    val people = listOf(Person("Sam"), Person("Alex"))
}

data class Person(val name: String)