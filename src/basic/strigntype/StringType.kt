package basic.strigntype

fun main(args: Array<String>) {
    var str: String = "Hello" // single quote is not allowed
    println(str)

    str = str + "\nKotlin!"
    println(str)

    println(str[8]) // t

    val num = 10 * 5 + 3
    println(str + num)
}
