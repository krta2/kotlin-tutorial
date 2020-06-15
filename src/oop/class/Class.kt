package oop.`class`

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val person: Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    val person2 = Person()
    person2.name = "김미영"
    person2.age = 29

    val person3 = Person()
    person3.name = "John"
    person3.age = 52

    println("${person.name} ${person.age}")
    println("${person2.name} ${person2.age}")
    println("${person3.name} ${person3.age}")
}
