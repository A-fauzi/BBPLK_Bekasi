package `Mobile-Application-And-Technology`.`UK-2`.Guidlines_And_Best_Practices_Write_Code

fun main() {
    val myArray = arrayOf(1,2,3, "Abcd")
    // Menghitung Value Jumlah pada array menggunakan fungsi size
    // mengeluarkan output value pada array menggunakan fungsi asList()
    println("array [${myArray.size}] = ${myArray.asList()}")

    // fungsi Array() untuk menentukan jumlah array
    // value {"ozi"} akan di buatkan nilai array nya menjadi 2 karna sudah ditetapkan sebelumnya
    val myArray2 = Array(2) {"ozi"}
    println("array [${myArray2.size}] = ${myArray2.asList()}")
}