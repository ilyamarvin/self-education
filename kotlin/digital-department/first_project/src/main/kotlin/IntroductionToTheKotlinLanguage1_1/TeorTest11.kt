fun main() {
    val (k, x, y) = readln().split(' ')

    // Для x и y, которые <= 23
    if (k.toInt() - x.toInt() >= 2 && k.toInt() - y.toInt() >= 2) {
        if (x.toInt() > y.toInt()) {
            println(k.toInt() - x.toInt())
        } else println(k.toInt() - y.toInt())
    // Для x и y, которые <= 24
    } else if (k.toInt() - x.toInt() >= 1 && k.toInt() - y.toInt() >= 1) {
        if (x.toInt() > y.toInt()) {
            println(k.toInt() - x.toInt())
        } else if (x.toInt() < y.toInt()) {
            println(k.toInt() - y.toInt())
        } else println(2)
    // Для x и y, которые == 25
    } else if (k.toInt() == x.toInt() || k.toInt() == y.toInt()) {
        if (x.toInt() > y.toInt()) {
            if (x.toInt() - y.toInt() >= 2) {
                println(0)
            } else if (x.toInt() - y.toInt() == 1) {
                println(1)
            } else println(2)
        } else if (x.toInt() < y.toInt()) {
            if (x.toInt() - y.toInt() <= -2) {
                println(0)
            } else if (x.toInt() - y.toInt() == -1) {
                println(1)
            } else println(2)
        } else println(2)
    // Для x и y, которые > 25
    } else if (x.toInt() > k.toInt() && y.toInt() > k.toInt()) {
        if (x.toInt() > y.toInt()) {
            if (x.toInt() - y.toInt() >= 2) {
                println(0)
            } else if (x.toInt() - y.toInt() == 1) {
                println(1)
            } else println(2)
        } else if (x.toInt() < y.toInt()) {
            if (x.toInt() - y.toInt() <= -2) {
                println(0)
            } else if (x.toInt() - y.toInt() == -1) {
                println(1)
            } else println(2)
        } else println(2)
    }
}
