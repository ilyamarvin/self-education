package nullSafety1_3

fun main() {
    val input: String? = null
    print(input?.length ?: "")
}