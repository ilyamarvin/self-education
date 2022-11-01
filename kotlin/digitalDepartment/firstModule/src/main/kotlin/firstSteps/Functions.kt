fun main() {
    println(testSimple(3, 7))
    println(testString(5))
    println(testNamedArguments(y = 1, z = 2, x = 3))
    println()
    
    testDefaultArguments()
    testDefaultArguments(y = 5)
    testDefaultArguments(3, 5)
    println()

    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println()
    printEven(*intArrayOf(1,2,3,4,5), 6, 7, 8, 9, 10)
}

fun testSimple(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

// Альтернатива перегрузке методов
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg
fun printEven(vararg number: Int) {
    number.forEach { e -> if (e % 2 == 0) println(e) }
}

