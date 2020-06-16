package oop.invokeoperator

fun main() {
    val product = Product(123123, "코틀린 200제")
    product(108) // same to product.invoke(108)
}