package ch02.ex3_5_SmartCasts

interface Expr // 標記介面，不會有任何方法被宣告，僅用於辨識
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int { // Smart Cast 的好用
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left) // 智慧轉型的變數背景會有其他標記
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
