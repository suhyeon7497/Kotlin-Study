package ch2_kotlin.null_safety

class User(var name: String? = null)

fun main(args: Array<String>) {
    var a: String? = "abc" // null이 들어갈 수 도 있음
    a = null
    val l = a?.length
    println(l)

    val b: String = "abc" // String 이면 null 이 못들어감
    val l2 = b!!.length // null 이면 NPE 발생
    println(l2)

    val c: String? = null
    val l3 = c?.length ?: -1
    // c가 null이면 c?.length = null
    // c?.a?.b?.length 처럼 체이닝 가능 중간에 하나라도 null → 전체 null
    // ?: 좌측 값이 null 이면 -1
//    if (c != null) c.length else -1
    println(l3)

    var user = User()
    user?.name = "update"
    println(user?.name)

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull();
    println(intList)
}
