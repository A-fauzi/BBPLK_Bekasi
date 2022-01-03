package `Mobile-Application-And-Technology`.`UK-2`.Guidlines_And_Best_Practices_Write_Code

fun main() {
    val myArray = arrayOf(arrayOf(1,2,3,4, "ozi"), Array(4) {"ozi"} )
    for (arr in myArray) {
        for (item in arr) {
            println(item)
        }
    }
}