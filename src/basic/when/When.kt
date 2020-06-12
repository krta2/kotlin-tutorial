package basic.`when`

fun main() {
    val score = 64

    when (score / 10) { // when replace java's old switch-case clause
        6 -> println("D")
        7 -> println("C")
        8 -> println("B")
        9, 10 -> {
            println("A")
            println("Great!")
        }
        else -> {
            println("F")
            println("You can do better...")
        }
    }
}
