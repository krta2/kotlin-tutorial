package oop.getterandsetter

class Person {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value >= 0) value else 0
        }
}