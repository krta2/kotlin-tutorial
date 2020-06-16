package oop.operatoroverloading

fun main() {
    val point1 = Point(3, 7)
    val point2 = Point(2, -6)

    (point1 + point2).printCoordinate() // 5, 1
    (point1 - point2).printCoordinate() // 1, 13
    (point1 * 2).printCoordinate() // 6, 14
    (point1 / 2).printCoordinate() // 1, -3
}
