package rsk

class Program {
    fun finobacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)
            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}