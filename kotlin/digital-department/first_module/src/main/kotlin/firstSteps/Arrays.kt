import java.util.*

fun main(args: Array<String>) {

    //массив вещественных чисел
    var arrDouble: DoubleArray
    var arrInt: IntArray = intArrayOf(1,2,3)
    var array = IntArray(10) { 5 }

    //обобщенный класс Array, массив целых чисел
    var arrIntArray: Array<Int>

    //обобщенный класс Array, массив строк с разрешенным null значением
    var arrStr: Array<String?>

    main2()

    val intAr = Array(5) { IntArray(6, { 0 }) }
}

fun main2() {
    var rand = Random()
    val intAr = IntArray(10) { rand.nextInt(300) }
    var sum = 0
    for (i in intAr){
        print("$i, ")
        if (i % 2 == 0)
            sum += i
    }
    println(sum)
}