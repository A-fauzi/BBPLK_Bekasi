package `Mobile-Application-And-Technology`.`UK-3`.Implemented_Alghoritm

fun main() {
    println("For Loops")
    for (i in 1..10) {
        println(i)
    }
    println("\n")

    println("Fancier For Loops")
    for (i in 1..10 step 2) {
        println(i)
    }
    println("\n")
    // Loop untuk collection
    println("For Loop with collection")
    val collection = listOf("ozi", "dinda", "kanaya")
    for (i in collection) {
        println(i)
    }
    println("\n")

    // Menggunakan indices withIndex Library kotlin
    println("For Loop with Collection and Indices")
    for (i in collection.withIndex()) {
        println("${i.index} ${i.value}")
    }
    println("\n")

    println("For loops with Collection for items & Indices")
    for ((index, value) in collection.withIndex()) {
        println("$index : $value")
    }
}