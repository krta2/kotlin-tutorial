package basic.comparisonoperator

fun main() {
    var isTrue: Boolean = (10 + 7) > (3 * 25)
    println(isTrue) // false

    isTrue = 0.00001f == 0.005f * 0.002f
    println(isTrue) // false
}
