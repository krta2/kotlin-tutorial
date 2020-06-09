package `8integerAndRealDataType`

fun main(arrgs: Array<String>): Unit {
    val a: Byte = 125
    val b: Short = (100 + 200) * 100
    var c: Int = 12_4354_6538
    c = 0xFF_88_88 // hexadecimal
    c = 0b01010010_0110011_01110101_01000101 // binary
    var d: Long = -543_7847_1234_1234_1234

    c = a + b
    d = c + 10L // literal as Long

    var e: Float = 67.6f // literal as Float
    val f: Double = 658.456
    e = (e + f).toFloat()
    println(e) // 726.05597
}
