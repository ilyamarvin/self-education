package extension1_6

fun String.countSpaces(): Int {
    var n = 0
    for (l in this.toCharArray()) {
        if (l == ' ') {
            n++
        }
    }
    return n
}

fun main() {
    println("abs he llo".countSpaces())
}