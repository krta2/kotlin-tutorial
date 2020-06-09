package `7bitwiseOperator`

fun main(arrgs: Array<String>): Unit {
    println(15 and 7) // 7
    println(5 or 2) // 7
    println(15 xor 5) // 10
    println(23767.inv()) // -32767(inverts)
    println(1 shl 3) // 8(shifts left)
    println(8 shr 1) // 4(shifts right)
    println(-17 ushr 2) // 1073741819(shifts right, filling the leftmost bits with zeros)
}
