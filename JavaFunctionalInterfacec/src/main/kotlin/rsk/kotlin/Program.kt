package rsk.kotlin

import rsk.java.Created
import rsk.java.User


fun main(args: Array<String>) {
    val user = User("Kevin")

    var count = 0

    //SAM-
    //var eventListener = { u: User -> println("User $u has been created: ${++count} times") }
    var eventListener = Created({ println("User $it has been created: ${++count} times") })

    user.create { eventListener }
    user.create { println("User $it has been created: ${++count} times") }

}