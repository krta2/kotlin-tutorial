package oop.indexedaccessoperator

fun main() {
    val person = Person("Kotlin", "2016-02-15")
    println("name: ${person[0]}, birthday: ${person[1]}")
    println("person[2]: ${person[2]}") // 알 수 없음

    person[2] = "foo"
    println("person[2]: ${person[2]}") // 알 수 없음
}