package basic.logicaloperator

fun main() {
    val a = 15
    val b = 17

    var bool: Boolean = (a - b < a + b) && (a == 15)
    println(bool) // true

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool) // false
}
