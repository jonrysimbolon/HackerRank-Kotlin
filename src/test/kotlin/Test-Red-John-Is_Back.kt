import kotlin.math.sqrt

fun checkPrime(n: Int): Boolean {

}

fun numberOfWays(n: Int): Int {

}

fun redJohn(n: Int): Int {

}

fun main() {
    val t = readLine()!!.trim().toInt()
    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()
        val result = redJohn(n)
        println(result)
    }
}

/*
    2
    1
    7

    0
    3

    --

    3
    3
    5
    8

    0
    2
    4
 */