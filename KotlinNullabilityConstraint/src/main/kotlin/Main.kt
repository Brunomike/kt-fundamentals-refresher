fun main(args: Array<String>) {
    var m: MeetingKt? = null
    var newMeeting = MeetingKt()

    newMeeting = m ?: MeetingKt()

    closeMeeting(m)
    //NPE caught when we pass null actual parameters to non-null argument type
    closeMeeting(newMeeting)

    m?.let {
        closeMeetingNonNull(m)
    }

}

fun closeMeetingNonNull(m: MeetingKt): Boolean? {
    return if (m.canClose) m.close()
    else false
}

fun closeMeeting(m: MeetingKt?): Boolean {
//    return if (m?.canClose == true) m?.close()
//    else false
    return if (m!!.canClose) m!!.close()
    else false
}

class MeetingKt {
    val canClose: Boolean = false
    lateinit var address: Address

    fun close(): Boolean {
        return true
    }

    fun save(o: Any) {
        val saveable = o as? ISavable
        saveable?.save()
    }

    fun init(addr: Address) {
        address = addr
    }
}

interface ISavable {
    fun save()
}

class Address {

}