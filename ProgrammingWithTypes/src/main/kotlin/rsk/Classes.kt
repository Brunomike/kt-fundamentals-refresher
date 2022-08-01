package rsk

/**
 * CLASSES
 * -final by default
 * -support abstract classes-must be implemented
 * -support modifiers
 * -support sealed classes
 * -support data classes
 */

fun main(args: Array<String>) {
    val kevin = Student("Michael", "Bruno", 1)
    println(kevin.id)
}

abstract class Person(var firstName: String, var lastName: String) {
    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student(firstName: String, lastName: String, _id: Int) : Person(firstName, lastName) {
    val id: Int
    var tutor: String

    init {
        id = _id
        tutor = ""
    }

    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(firstName, lastName, _id) {
        this.tutor = tutor
    }

    override fun getName(): String {
        return ""
    }

    override fun getAddress(): String {
        return ""
    }
}

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when (event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}
