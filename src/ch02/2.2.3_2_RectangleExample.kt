package geometry.example // 可以隨意更換，Kotlin 的 package name 不一定要跟目錄結構綁定，但一般而言，我們不會特地去更動 package name

import geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}
