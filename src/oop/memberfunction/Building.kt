package oop.memberfunction

class Building {
    var name = ""
    var date = ""
    var area = 0

    fun print() {
        println("이름: ${this.name}")
        println("건축일자: $date") // 'this' can be omitted
        println("면적: ${this.area} m^2")
    }
}