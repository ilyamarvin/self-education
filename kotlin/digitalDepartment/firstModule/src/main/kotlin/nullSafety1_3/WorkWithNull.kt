package nullSafety1_3

fun main() {
    var k:Int = 0 //null - недопустимое значение k

    var k1:Int? = null //null может быть значением k1

    var a: String = "abc"
//    a = null // ошибка компиляции

    var b: String? = "abc"
    b = null // ok

    val l1 = a.length
//    val l2 = b.length // ошибка: переменная b может быть null

    val l3 = if (b != null) b.length else -1

    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        print("Empty string")
    }

    println(b?.length)

    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // выводит A и игнорирует null
    }

    val name : String?  = null
    val length: Int = name?.length ?:0
    println(length)

}