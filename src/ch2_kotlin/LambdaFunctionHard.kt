package ch2_kotlin

fun main(args: Array<String>) {
    // 고차 함수
    fun repeatAction(action: () -> Unit) {
        action()
        println("hello")
        action()
    }

    repeatAction { println("repeated action") }
    measure { Thread.sleep(1000) }


    firstMethod(2, { println("Just some dummy function") }, { println("can't pass function in inline functions") })

    f()

//    // non-local return의 예시
//    inlineFunction { return } // crossline 설정 시, return을 적으면 에러 발생
//    println("hello")
}

// 기존 ->  compile 시 이 메서드가 만들어질때 객체로 만들어진다.
// inline 붙이면 -> 메서드가 코드영역에 그대로 붙여진다.
inline fun measure(block: ()-> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("${System.currentTimeMillis() - start} milliseconds")
}

// func2 같은 경우를 값처럼 사용하면 그대로 붙여넣을 수 없기 때문에 noinline을 붙여야 한다.
inline fun firstMethod(a: Int, func1:() -> Unit, noinline func2: () -> Unit) {
    func1()
    secondMethod(10, func2)
}

fun secondMethod(a: Int, func: () -> Unit): Int {
    func()
    return 2 * a
}

fun f() {
    listOf(1, 2, 3).forEach {
        if (it == 2) return@forEach // local jump 라고 한다
        println(it)
    }
    println("끝")
}

// 람다 안에서 return을 사용하면 non-local return 이 발생한다.
// 이것이 main 함수를 return 해버릴 수 도 있다. return을 명시적으로 차단하게 하기 위해 crossinline을 사용한다
inline fun inlineFunction(
//    crossinline func: () -> Unit
    func: () -> Unit) {
    func()
}

// 코드를 박아넣을 때 T 값까지 그대로 박아 넣는다.
inline fun <reified T> printType() {
    println(T::class)
}

// 예시 1
//inline fun <reified T> fromJson(json: String): T {
//    return objectMapper.readValue(json, T::class)
//}
