fun main(args: Array<String>) {
    var financeMeeting = mutableListOf(FinanceMeeting())
    var meetings: AllMeetings<FinanceMeeting> = AllMeetings(financeMeeting)

    attendAllMeetings(meetings)
}

class AllMeetings<out T : Meeting>(val meetings: List<Meeting>) {
    val count: Int get() = meetings.count()

    operator fun get(i: Int) = meetings[i]
}

fun attendAllMeetings(meetings: AllMeetings<Meeting>) {
    for (i in 0 until meetings.count) {
        meetings[i].attend()
    }
}