import rsk.java.Meeting
import rsk.java.Organizer

fun main(args: Array<String>) {
    var people: MutableList<Person?>? = null
    people = mutableListOf(Person(22), Person(23))

    people.add(null)

    for (person: Person in people.filterNotNull()) {
        println(person.age)
    }

    //listOf, setOf, mapOf--read-only
    //arrayListOf, hashSetOf, hashMapOf
    //mutableListOf


    for (i in args.indices) {
        println("$i ${args[i]}")
    }

    val items = IntArray(2)
    items[0] = 1
    items[1] = 2

    val number = intArrayOf(1, 2, 3, 4, 5)

    number.forEachIndexed { index, element ->
        println("$index is: $element")
    }
}

class Person(val age: Int) : Organizer {
    override fun processMeetings(meetings: MutableList<Meeting>?) {
        TODO("Not yet implemented")
    }
}