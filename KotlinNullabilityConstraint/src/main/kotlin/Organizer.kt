import rsk.java.MeetingN

fun main(args: Array<String>) {
    val m = MeetingN()

//    m.addTitle("Title")
//    m.addTitle(null)
//
//    val title: String? = m.meetingTitle()
//
//    println(title)

    val title:String =m.titleCanBeNull()?:"nobody"
    println(title)
}