package medium

import kotlin.math.sqrt

/*
 * Complete the 'redJohn' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */


fun checkPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    val sqrtN = sqrt(n.toDouble()).toInt()
    for (i in 5..sqrtN step 2) {
        if (n % i == 0 || n % (i + 2) == 0) return false
    }
    return true
}

fun numberOfWays(n: Int): Int {
    if (n < 4) return 1

    val cacheArr = IntArray(n + 1) { 0 }
    cacheArr[1] = 1
    cacheArr[2] = 1
    cacheArr[3] = 1
    cacheArr[4] = 2

    for (i in 5..n) {
        cacheArr[i] = cacheArr[i - 1] + cacheArr[i - 4]
    }
    return cacheArr[n]
}

fun redJohn(n: Int): Int {
    val ways = numberOfWays(n)
    var primeCount = 0
    for (i in 1..ways) {
        if (checkPrime(i)) {
            primeCount++
        }
    }
    return primeCount
}

fun main() {
    val t = readLine()!!.trim().toInt()
    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()
        val result = redJohn(n)
        println(result)
    }
}
