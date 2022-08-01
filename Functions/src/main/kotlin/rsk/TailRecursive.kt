package rsk

import java.math.BigInteger

//Tail Recursive Functions
/**
 * Use tailrec keyword
 * Have correct 'form'
 * Kotlin optimises away the recursion
 */

fun  main(args:Array<String>){
    println(fib(10000, BigInteger("1"),BigInteger("0")))
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}
//1,1,2,3,5