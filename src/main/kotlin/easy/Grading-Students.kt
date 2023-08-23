package easy

import kotlin.math.ceil

fun upMultiple5(n: Int): Int {
    val compareValue = (ceil(n.toDouble() / 5) * 5).toInt()
    val diffValue = compareValue - n
    if (diffValue < 3 && compareValue >= 40) {
        return compareValue
    }
    return n
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    for (i in grades.indices) {
        grades[i] = upMultiple5(grades[i])
    }

    return grades
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}