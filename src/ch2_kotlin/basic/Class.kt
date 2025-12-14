package ch2_kotlin.basic

open class Shape // open을 붙여줘야 상속 가능

class Rectangle(val height: Int, val width: Int,
//                val perimeter: Int = (height + width) * 2 // constructor 로 받거나 말거나
): Shape() {
    val perimeter = (height + width) * 2 // constructor 로 안 받을 때
    var area: Int = height * width
        get() = field
        set(value) {
            field = value
        }

    val hello = "hi"
    fun draw() {
        println("hello")
    }
}

fun main() {
    val rectangle = Rectangle(5, 5)
    println(rectangle.perimeter)
    println(rectangle.area)
    rectangle.draw()
    println(rectangle.hello)
    println(rectangle.area.isEven)
}

inline val Int.isEven: Boolean
    get() = this % 2 == 0
