fun main() {
    testWhen(1)
    testWhen(15)
    testWhen("asd")

    val x = 5

    when {
        x%2==1 -> print("x is odd")
        x%2==0 -> print("x is even")
        else -> print("x is funny")
    }

}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Была введена строка длины ${input.length}")
        else -> println("Что-то еще")
    }
}

/**
 * public void testWhen(Object input) {
 *  if (input instanceOf String) {
 *      String strInput = (String) input;
 *  }
 *  if (input instanceOf Integer) { ... }
 * }
 */
