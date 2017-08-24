package kthello2
import java.util.*


fun main(args: Array<String>): Unit{
    val scope = "Roman"
    println("hello \\$$scope!")
    main2()
    main3()
    main4()
}

fun ternar(a: Int, b: Int): Int {
    return if (a == b) a else 3
}


fun max_calculate(a:Int, b: Int): Int{
    if (a>b) return a
    return b
}

fun min_calculate(a:Int, b: Int): Int{
    if (a>b) return b
    return a
}

fun main2()=println("hello")

fun main3() {
    println("hello")
}

fun main4() {
    println("hello")
}