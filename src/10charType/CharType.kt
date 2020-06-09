package `10charType`

fun main(arrgs: Array<String>): Unit {
    var ch: Char = 'A'
    println(ch) // A

    ch = '\uAC00' // unicode
    println(ch) // 가

    ch = '한'
    println(ch.toInt()) // 54620
}
