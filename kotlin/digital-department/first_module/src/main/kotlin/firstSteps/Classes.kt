fun main() {
    val p1 = Person("Bob", "Jogners", 30)
    val child = Person("Baby", "Jogners", 1)
    val p2 = Person("Ann", "Jogners", 25, child)
    println(p2.firstName + " " + p2.children)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true
}

// Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created with name $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    // конструктор без аргументов
    constructor() : this("", "", -1)
}

// с помощью data создаются все необходимые методы (toString, HashCode, equals и тд)
data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1
        set(value) {
            if (value<0) println("Negative value")
            field = value
        }

    fun area() = height * length
}