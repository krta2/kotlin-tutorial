package basic.unittype

fun main() {
    addAndPrint(1, 2)
}

fun addAndPrint(a: Int, b: Int): Unit { // : Unit can be omitted
    println(a + b)
}
