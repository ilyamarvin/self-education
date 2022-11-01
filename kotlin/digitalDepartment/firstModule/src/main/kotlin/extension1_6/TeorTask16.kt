package extension1_6

fun String.isValidCCNumber(): Boolean {
    var card = this.replace(" ", "")
    var sum = 0
    card = card.reversed()
    for (i in card.indices) {
        sum += when {
            (i % 2 != 0 && (card[i].digitToInt()*2 <= 9)) -> (card[i].digitToInt())*2
            (i % 2 != 0 && (card[i].digitToInt()*2 > 9)) -> (card[i].digitToInt())*2-9
            else -> card[i].digitToInt()
        }
    }
    return sum % 10 == 0
}

fun IntArray.isSorted(): Boolean {
    for (i in 1..this.size)
        if (this[i + 1] > this[i])
            return false
    return true
}

fun main() {
    val array: IntArray = intArrayOf(10, 15, 20)
    println(array.isSorted())

    val strings = arrayOf("foo", "bar", null, "", 123)
    for (s in strings){
        s?.let { print ("$it ") }
    }
}