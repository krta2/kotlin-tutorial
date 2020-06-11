package basic.assignmentoperator

fun main() {
    val a: Int
    var b: Int

    a = 10 + 5
    b = 10

    b += a
    println(b) // 25

    b %= 3
    println(b) // 1
}
