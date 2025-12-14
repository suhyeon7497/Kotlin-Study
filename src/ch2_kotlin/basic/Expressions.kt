package ch2_kotlin.basic

fun main(args: Array<String>) {
    fun describe(obj: Any): String =
        when (obj) {
            1           -> "One"
            "Hello"     -> "Greeting"
            is Long     -> "Long"
            !is String  -> "Not a String"
            else        -> "Unknown"
        }

    val a: Long = 2
    println(describe(a))

    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fit in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    for (index in list.indices) {
        println("${list[index]} is in list.")
    }

    for (item in list) {
        print("$item ")
    }
    println()

    when {
        "a" in list -> println("when : a is in the list.")
        "b" in list -> println("when : b is in the list.")
    }
    for (c in 1..10 step 2) {
        print(c)
    }
    println()
    for (c in 1..10 step 3) {
        print(c)
    }
}
