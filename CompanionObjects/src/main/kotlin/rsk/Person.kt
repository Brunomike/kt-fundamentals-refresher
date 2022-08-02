package rsk

class Program{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val kevin= Student("Kevin","Jones",1,"Some tutor")
            println(Student.createPostgraduate("Michael"))
        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {
    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

open class Student(firstName: String, lastName: String, _id: Int) : Person(firstName, lastName) {
    val id: Int
    var tutor: String

    init {
        id = _id
        tutor = ""
    }

    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(firstName, lastName, _id) {
        this.tutor = tutor
    }

    fun enroll(courseName: String) {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }

    override fun getName(): String {
        return ""
    }

    override fun getAddress(): String {
        return ""
    }

    companion object :XmlSerializer<Student>{
        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }

        fun createUndergraduate(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgraduate(name: String): Postgraduate {
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1) {}
class Postgraduate(firstName: String) : Student(firstName, "", 1) {}

interface XmlSerializer<T> {
    fun toXml(item: T)
}