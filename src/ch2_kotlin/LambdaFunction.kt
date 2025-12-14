package ch2_kotlin

fun main(args: Array<String>) {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    val items = listOf(1, 2, 3, 4, 5)
    items.fold(0) {
        acc: Int, i: Int ->
        print("acc: $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        result
    }

    val joinedToString = fruits.fold("Fruits:", {acc, i -> "$acc $i" })
    println(joinedToString)
    val product = items.fold(1, Int::times)
    println(product)
}
