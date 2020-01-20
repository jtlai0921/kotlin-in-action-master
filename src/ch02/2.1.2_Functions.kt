package ch02.ex1_2_Functions

import java.util.*

fun max(a: Int, b: Int): Int { // 回傳型別可寫可不寫（自動推斷），但作者建議還是要寫出來，可以增加程式的可讀性，也可以預防人為疏忽的 Bug
    return if (a > b) a else b // 作者表示： return 可以增加可讀性，故保留該關鍵字
}

fun main(args: Array<String>) {
    println(max(1, 2))
}

// 範例：回傳值建議寫清楚
class returnType {
var a = 50
var b = Random().nextInt(100) + 1

var v1 = if (a > b) 1 else -1 // v1 為 Int 型別
var v2 = if (a > b) 1 else "" // 可是 v2 為 Any 型別
}
