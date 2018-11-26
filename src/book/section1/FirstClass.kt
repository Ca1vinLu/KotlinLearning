package book.section1

data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {
    val persons = listOf(
        Person("Calvin", 21),
        Person("Lu", 22)
    )
    persons.forEach { println(it) }
}


/**
 * 函数的多种写法
 */

// 代码块
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}

// 表达式
//fun max(a: Int, b: Int) = if (a > b) a else b