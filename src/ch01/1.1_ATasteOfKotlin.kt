package ch01.ex1_ATasteOfKotlin

// data：類似自動產生 bean，會將 class 自動產生 getter, setter, toString...
data class Person(val name: String,
                  val age: Int? = null) // int? 可為空值的資料型態

fun main(args: Array<String>) { // args: Array<String> 若沒有使用到，可以省略
    val persons = listOf(Person("Alice"),
                         Person("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 } // lambda 表示式；Elvis 運算子
    println("The oldest is: $oldest") // The oldest is: Person(name=Bob, age=29)
}

fun testSamrtCase(obj: Any) {
    if (obj is Person) obj.age
}