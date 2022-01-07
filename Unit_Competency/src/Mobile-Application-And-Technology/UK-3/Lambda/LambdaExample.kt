package `Mobile-Application-And-Technology`.`UK-3`.Lambda

fun main() {
    // Contoh 1
    var test1: (Int, Int) -> Int = {a: Int, b: Int -> a * b }
    println(test1(5, 5))

    // Contoh2
    var test2: (Int, Int) -> Int = {a, b -> a * b}
    println(test2(5, 5))

    // Lambda dengan satu parameter
    // dapat disingkat dengan it keyword
    var test3: (Int) -> Int = {it * 5}
    println(test3(5))
}