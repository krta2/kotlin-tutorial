package basic.ifexpression

fun main() {
    val value: Int = if (10 > 5) {
        println("10 > 5")
        10
    } else { // If there is no else, if statement won't be expression
        println("10 <= 5")
        5
    }

    println(value)
    /*
    10 > 5 <- Printed when if statement is evaluated
    10 <- Printed when println evaluated
     */
}
