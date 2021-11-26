package `Mobile-Application-And-Technology`.`UK-4`.Using_The_Structure_Data.Collection

fun main() {
    var number = listOf(1, 2, 3, 4, 5)
    var names = listOf("A", "B", "C", "D", "E")
    for (name in names) {
        println(name)
    }

    /**
     * add mixedType in listOf()
     */
    val mixedType = listOf(1, "A", true, 3.14)
    for (mix in mixedType) {
        println(mix)
    }

    /**
     * ListOfNull Function
     */
    val listOfNull: List<String> = listOfNotNull("A", "B", null, "C")
    for (str in listOfNull) {
        println(str)
    }

    println(names.size)
}