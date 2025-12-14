package ch2_kotlin.classtype

data class Person(val name: String, val nickname: String) {
    var age: Int = 0
}
// equals, hashCode, toString, copt 자동 생성
// 상속 불가

data class Employee(val name: String, val roles: MutableList<String>)

fun main(args: Array<String>) {
    val person1 = Person("John", "nickname1")
    val person2 = Person("John", "nickname1")
    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}") // primary constructor 값으로만 equals 비교
    println("person1 with age ${person1.age}: $person1")
    println("person2 with age ${person2.age}: $person2")

    val original = Employee("Jamie", mutableListOf("developer")) // 얕은 복사
    val duplicate = original.copy()
    duplicate.roles.add("team lead")
    println(original)
    println(duplicate)

    val (name, nickname) = person1
    println("$name, $nickname")
}
