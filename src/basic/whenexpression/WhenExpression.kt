package basic.whenexpression

fun main() {
    val score = 88

    val grade: Char = when (score / 10) {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }

    println(grade) // B
}
