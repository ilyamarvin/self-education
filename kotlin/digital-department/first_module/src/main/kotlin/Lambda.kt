fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> println(e) }
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sum, e -> sum + e }) // sum()

    println(a.sortedByDescending { it })

    println(a.any { it > 10 }) // false
    println(a.all { it < 10 }) // true
    println(a.sum())

    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    println("positive numbers are $positive")
    println("negative numbers are $negative")
    println()

    val result = listOf("a", "b", "ba", "ccc", "ad", "qwerty").groupBy { it.length }
    println(result) // HashMap или LinkedHashMap
}