package basic.literaldatatype

fun main(args: Array<String>): Unit {
    val a = 10 + 12 - 5 // infer type as Int
    println(a is Int)
}
