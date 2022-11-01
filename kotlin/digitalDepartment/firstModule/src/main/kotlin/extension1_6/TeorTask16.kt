package extension1_6

fun String.isValidCCNumber() {

}

fun IntArray.isSorted(): Boolean {
    for (i in 1..this.size)
        if (this[i] < this[i+1])
            return false
    return true
}

fun main() {
    val array:IntArray = intArrayOf(10, 15, 20)
    println(array.isSorted())
}