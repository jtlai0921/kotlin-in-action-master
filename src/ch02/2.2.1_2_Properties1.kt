package ch02.person

class Person(
    val name: String, // 不可變動的，對應 Java 中的 final，具有 thread safe 的特性，建議使用
    var isMarried: Boolean // 一般變數，不具有 thread safe 的特性
)

fun main(args: Array<String>) {
    val person = Person("Bob", true) // 產生物件不需要 new
    println(person.name) // 直接透過欄位名稱呼叫，但事實上還是透過 getter
    println(person.isMarried)
}
