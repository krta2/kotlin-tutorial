package oop.`object`

fun main() {
    val person = object {
        val name: String = "이우현"
        val age: Int = 25
    }

    println(person.name)
    println(person.age)
}
