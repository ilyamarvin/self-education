package functionsInKotlin1_2

fun countVowels(str: String): Int {
    val str = str.toLowerCase()
    var counter: Int = 0
    for (char in str) {
        if (char == 'a' || char == 'e' || char == 'i'|| char == 'o' || char == 'u'){
            counter++
        }
    }
    return counter
}

fun main() {
    println(countVowels("hellooo"))
}