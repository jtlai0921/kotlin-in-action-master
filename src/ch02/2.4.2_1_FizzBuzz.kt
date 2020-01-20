package ch02.FizzBuzz

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
    test()
}

fun test() {
    for (i in 1..10) {
        print(i)
    }
    println()
    for (i in 1 until 10) {
        print(i)
    }
    println()
    for (i in 1.until(10)) {
        print(i)
    }
}