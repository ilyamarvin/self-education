package interfaces1_5

interface MyInterface {
    val prop: Int // абстрактное свойство
    val propertyWithImplementation: String
        get() = "foo"
    fun foo() {
        print(prop)
    }
}