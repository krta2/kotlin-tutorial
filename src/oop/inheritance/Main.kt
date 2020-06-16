package oop.inheritance

open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int): Person(name, age)

fun main() {
    val person = Person("홍길동", 33)
    val student = Student("김철수", 23, 123123123)

    println(student.name)
}