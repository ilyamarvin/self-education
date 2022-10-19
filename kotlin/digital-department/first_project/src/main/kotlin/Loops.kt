fun main() {
    val items = listOf("apple", "banana", "orange") // List.of() Java 9

    for (item in items) {
        println(item)
    }
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    for (i in 1..5) println(i)
    println()
    for (i in 1 until 5) println(i)
    println()
    for (i in 5 downTo  1) println(i)
    println()
    for (i in 0..10 step 2) println(i)
}