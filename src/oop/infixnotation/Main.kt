package oop.infixnotation

class Point(var x: Int = 0, var y: Int = 0) {
    // base 를 원점으로 뒀을 때의 좌표를 반환한다.
    infix fun from(base: Point): Point {
        return Point(x - base.x, y - base.y)
    }
}

fun main() {
    val point = Point(3, 6) from Point(1, 1) // same as Point(3, 6).from(Point(1, 1))
    println("${point.x}, ${point.y}") // 2, 5
}