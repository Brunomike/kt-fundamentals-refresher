import rsk.java.Address
import rsk.java.MeetingN

fun main(args: Array<String>) {
    val m = MeetingN()

//    m.addTitle("Title")
//    m.addTitle(null)
//
//    val title: String? = m.meetingTitle()
//
//    println(title)

    val title: String = m.titleCanBeNull() ?: "nobody"
    println(title)

//    val homeAddress=HomeAddress()
//    println(homeAddress.firstAddress)
}

class HomeAddress : Address {
    override fun getFirstAddress(): String {
        return "Home Address";
    }
}

class WorkAddress : Address {
    override fun getFirstAddress(): String? {
        return "Work Address";
    }
}

