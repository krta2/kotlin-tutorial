package basic.variable

fun main(args: Array<String>): Unit {
    var total: Int
    total = 0

    val a: Int = 10 + 53 - 7
    println(a) // 56

    val b: Int = 43 + 75 + a
    println(b) // 174

    total = a + b
    println(total) // 230
}
