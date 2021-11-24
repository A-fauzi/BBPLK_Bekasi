package `Mobile-Application-And-Technology`.`UK-3`.Implemented_Alghoritm

fun main() {
    println("for loop")
    for (i in 1..10) {
        println("Perulangan ke $i")
    }
    println()

    println("Fancier for loop")
    for (i in 6 downTo 0 step 2) {
        println("Perulangan ke $i")
    }

// Loop untuk collection
    var myCollection = listOf("A", "B", "C", "D", "E")
    for (i in myCollection) {
        println("Data $i")
    }
    println()

//  indices with index
    println("For loops with collection on indices")
    for (i in myCollection.indices) {
        println("$i : ${myCollection[i]}")
    }
    println()

    println("For loops with collection for items & indices")
    for ( (index, value) in myCollection.withIndex()) {
        println("$index : $value")
    }
}