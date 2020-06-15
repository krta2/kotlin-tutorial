package oop.tripleequal

fun main() {
    var a = "one"
    var b = "one"

    println(a == b) // true
    println(a === b) // true: same literal string generated on heap memory once.

    b = "on"
    b += "e"
    println(a === b) // false: not same literal

    b = a
    println(a === b) // true
}
