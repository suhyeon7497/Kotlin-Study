package ch2_kotlin.basic

class User(var name: String = "", var age: Int = 0)

fun main(args: Array<String>) {
    var user = User("Dmitry")
    val nameLength = user?.let {
        it.name.length
    }
    println(nameLength)

    user = User().apply {
        name = "apply"
        age = 0
    }

    println("${user.name} is ${user.age}")
    user
        .also { it.name = "also" }
        .also { println("${it.name} is ${it.age}") }

    val result = user.run {
        age + name.length
    }
    println(result)

    with(user) {
        println("$name, $age")
    }
}
