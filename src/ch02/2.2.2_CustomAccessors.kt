package ch02.ex2_2_CustomAccessors

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // 客製化 getter，其實也可以省去大括號
            return height == width
        }
//        get() = height == width
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}
