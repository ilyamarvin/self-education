fun main() {
    var a: String = "Hello"
//    a = null // NPE исключение
    a.length

    var b: String? = "Test"
    b = null
//    b.length // не работает (Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver)
    // Вернет длину b, если null -> null (Никаких NPE)
    b?.length

//    bob?.department?.head?.name -> если хоть где-то есть null -> сразу возвращает null (Никаких NPE)

    a?.length // Unnecessary safe call on a non-null receiver of type String потому что а не null

    // Elvis оператор - ?: (если b не null, то вернет длину, иначе положим в переменную -1)
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "asd" else null
    // !! - выбрасывает NPE в случае если в переменной null
    val t = b!!.length
}