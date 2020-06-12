package basic.importexample

import basic.packageexample.add
import basic.packageexample.max as customMax

fun main() {
    println(add(1, 2))
    println(customMax(100, 200))
}