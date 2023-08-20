package cache
/*
prime number = 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37
20
 */

/*
 4 = 2
 5 = 3
 6 = 4
 7 = 5
 8 = 7
 9 = 10
10 = 14
11 = 19
12 = 26
13 = 36
14 = 50
15 = 69
 */

/*
fun checkPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    val sqrtN = kotlin.math.sqrt(n.toDouble()).toInt()
    for (i in 5..sqrtN step 2) {
        if (n % i == 0 || n % (i + 2) == 0) return false
    }
    return true
}

fun checkPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
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
}*/