package `Mobile-Application-And-Technology`.`UK-2`.Guidlines_And_Best_Practices_Write_Code

fun main() {
    // type data pada value di variable data adalah integer
    val data = 10
    println("data $data")
    checkType(data)
}

fun checkType(data: Any) {
    when (data) {

        // Is adalah Type Checking yang sudah dibuat oleh kotlin
        is Int -> {
            println("data is integer")
        }
        is String -> {
            println("data is string")
        }
        else -> {
            println("data is unknown")
        }
    }
}