import kotlin.math.sqrt

fun checkPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    val limit = sqrt(n.toDouble()).toInt()
    for (i in 5 .. limit step 2) {
        if (n % i == 0 || n % (i + 2) == 0) return false
    }

    return true
}

fun numberOfWays(n: Int): Int {
    if (n < 4) return 1

    val cache = IntArray(n + 1) { 0 }
    cache[1] = 1
    cache[2] = 1
    cache[3] = 1
    cache[4] = 2

    for (i in 5..n) {
        cache[i] = cache[i - 1] + cache[i - 4]
    }
    return cache[n]
}

fun redJohn(n: Int): Int {
    val countWay = numberOfWays(n)
    var sizePrime = 0

    for (i in 1..countWay) {
        if (checkPrime(i)) {
            sizePrime++
        }
    }
    return sizePrime
}

fun main() {
    val t = readLine()!!.trim().toInt()
    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()
        val result = redJohn(n)
        println(result)
    }
}
