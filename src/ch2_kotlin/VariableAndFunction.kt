package ch2_kotlin

fun main(args: Array<String>) {
    val num1 = 1;
    var num2 = 2;
    num2 = 3;

    // 위에서는 incrementNum2() 호출 불가
    fun incrementNum2() = num2++
    incrementNum2()
    sum(num1, num2)
}

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

fun sum(a: Int, b: Int) = a + b

