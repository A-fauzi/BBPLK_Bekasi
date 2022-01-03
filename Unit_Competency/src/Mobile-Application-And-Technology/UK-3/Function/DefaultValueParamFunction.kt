package `Mobile-Application-And-Technology`.`UK-3`.Function

fun main() {
    println(defaultValue(5, 5))
}

fun defaultValue(angka1: Int = 1, angka2: Int = 2): Int {
    return angka1 + angka2
}