package `Mobile-Application-And-Technology`.`UK-3`.Implemented_Alghoritm

fun main() {
    val variable = "var"
    when(variable){
        "var" -> {
            // Blok kode yang akan dieksekusi
            // Jika variable = "var"
        }
        "val" -> {
            // Blok kode yang akan dieksekusi
            // Jika variable = "val"
        }
        else -> {
            // Blok kode yang akan dieksekusi
            // Jika variable bukan "var" dan bukan "val"
        }
    }

    val nilai: Int = 51
    var grade: String = ""
    when(nilai) {
        in 0..40 -> grade = "E"
        in 41..50 -> grade = "D"
        in 51..60 -> grade = "C"
        in 61..70 -> grade = "B"
        in 71..100 -> grade = "A"
        else -> grade = "Nilai tidak valid"
    }
    println("Nilai kamu $nilai, grade kamu $grade")
    if (grade == "B" || grade == "A") {
        println("Selamat ya!")
    } else {
        println("Coba lagi ya!")
    }
}