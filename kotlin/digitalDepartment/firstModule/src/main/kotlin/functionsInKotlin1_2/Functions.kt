package functionsInKotlin1_2

fun main() {
    fun sumFirst(a: Int, b: Int): Int {
        return a + b
    }

    fun sumSecond(a: Int, b: Int) = a + b

    println(sumFirst(1, 5))
    println(sumSecond(2, 6))

    // lambda functions
    val helloWithName = { a: String -> println("Hello, $a") }
    helloWithName("Ilya")

    val sumFirstLambda = { a: Int, b: Int -> a + b }
    println(sumFirstLambda(1, 2))

    val sumSecondLambda: (Int, Int) -> Int = { a, b -> a + b }
    println(sumSecondLambda(3, 4))

    val sumTwiceLambda = { a: Int, b: Int ->
        a + b
        a + b// выведет только последнее значение
    }
    println(sumTwiceLambda(5, 10))

    var res = { x: Int, y: Int ->
        var result = 2 * x + y
        result //возвращаемое из лямбда значение
    }
    println(res(12, 15))

    action(4, 5) { x: Int, y: Int -> x * y }
    var sum = { x: Int, y: Int -> x + y }
    action(6, 7, sum)
    action(10, 5) { x: Int, y: Int -> x / y }

    operation(9,5, fun(x: Int, y: Int): Int { return x + y })   // анонимная функция как параметр
    operation(9,5, fun(x: Int, y: Int): Int = x - y)
}

fun action(n1: Int, n2: Int, operation: (Int, Int) -> Int) {
    val result = operation(n1, n2)
    println(result)
}

fun operation(x: Int, y: Int, op: (Int, Int) -> Int) {
    val result = op(x, y)
    println(result)
}