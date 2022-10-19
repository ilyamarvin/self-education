fun main() {
    // Numbers
    /// Integer types
    val numByte: Byte = 1 // Type: Byte, Size(bits) = 8, value -128 to 127
    val numShort: Short = 1 // Type: Short, Size(bits) = 16, value -32768 to 32767
    val numInt: Int = 1 // Type: Int, Size(bits) = 32, value -2,147,483,648 to 2,147,483,647
    val numLong: Long = 1 // Type: Long, Size(bits) = 64, value -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    /// Floating-point types
    val numFloat: Float = 1.0F // Type: Byte, Size(bits) = 32, Значимые биты = 24
    val numDouble: Double = 1.0 // Type: Short, Size(bits) = 64, Значимые биты = 53

    val c: IntRange = 1..5 // Создание диапазона
    println(numByte in c) // Проверка, входит ли число в этот диапазон
    println()

    // Booleans
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
    println()

    // Characters
    val aChar: Char = 'a'
    println(aChar)
    println()

    // Strings
    val str: String = "abcd 123"
    println(str)

    for (c in str) {
        println(c)
    }

    println(str.uppercase())

    val s = "abc" + 1
    println(s + "def")

    /// String templates
    val i = 10
    println("i = $i") // Prints "i = 10"

    val b = "abc"
    println("$b.length is ${b.length}") // Prints "abc.length is 3"
}