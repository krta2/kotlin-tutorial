package oop.propertyinconstructor

class Car(var name: String, val speed: Int = 0)

fun main() {
    val car = Car("My Car")
    car.name = "Your car"
    println("name: ${car.name}, speed: ${car.speed}")
}
