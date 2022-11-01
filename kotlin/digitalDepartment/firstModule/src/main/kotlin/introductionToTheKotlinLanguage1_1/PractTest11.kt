fun main() {
    // Task 1
    // Дана комната со сторонами a и b и ковер со сторонами m и n.
    // Определить помещается ли ковер в комнату (ковер можно поворачивать, но нельзя складывать).
    // На вход программе подается четыре вещественных числа, разделенных пробелом: a, b, m и n.
    // На выходе необходимо напечатать "YES", если ковер помещается в комнату и "NO" в противном случае.
    // Входные данные	    Выходные данные
    // 10.0 4.0 7.0 3.0     YES

    val (a,b,m,n) = readln().split(' ')

    val wallSquare = a.toDouble() * b.toDouble()
    val carpetSquare = m.toDouble() * n.toDouble()

    if (wallSquare > carpetSquare) {
        println("YES")
    } else println("NO")

    // Task 2
    // ДНК состоит из 4 типов нуклеотидов: A (аденин), T (тимин), G (гуанин), C (цитозин).
    // Ваша программа получает на вход строку вида ATGCCTCTCTC и должна посчитать число нуклеотидов каждого типа
    // (вывести числа через пробел в порядке как в строке выше).
    // Входные данные	Выходные данные
    // ATGCCTCTCTC      1 4 1 5

    val str = readln()
    var A: Int = 0; var T: Int = 0; var G: Int = 0; var C: Int = 0
    for (char in str) {
        if (char == 'A') {
            A++
        } else if (char == 'T') {
            T++
        } else if (char == 'G') {
            G++
        } else if (char == 'C') {
            C++
        }
    }
    print(A); print(" "); print(T); print(" "); print(G); print(" "); print(C)
}