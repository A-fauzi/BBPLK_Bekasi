package `Mobile-Application-And-Technology`.`UK-4`.Using_The_Structure_Data.Collection

fun main() {

    // Ranges

    /**
     * Menghitung angka 1 sampai 5 dengan range
     */
    val oneTwoFive = 1..5
    for (n in oneTwoFive) {
        println(n)
    }

    /**
     * Menghitung karakter 'a' sampai 'z' dengan range
     */
    val aToZ = 'a'..'z'
    for (letter in aToZ) {
        println(letter)
    }

    /**
     * Fungsi rangTo()
     */
    val rangeToFunction: IntRange = 1.rangeTo(10)
    for (n in rangeToFunction) {
        println("rangeTo $n")
    }

    /**
     * Fungsi downTo()
     */
    val downToFunction = 10.downTo(1)
    for (n in downToFunction) {
        println("downTo $n")
    }

    /**
     * Fungsi step()
     */
    val stepFunction = 1.rangeTo(10).step(2)
    for (n in stepFunction) {
        println("step $n")
    }

    /**
     * in operator
     */
    val inOperator = 2..10
    if (1 in inOperator) {
        println("1 in inOperator")
    } else {
        println("1 not in inOperator")
    }

}