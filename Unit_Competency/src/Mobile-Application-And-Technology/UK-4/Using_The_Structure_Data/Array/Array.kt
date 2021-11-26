package `Mobile-Application-And-Technology`.`UK-4`.Using_The_Structure_Data.Array

fun main() {
    // Create array of function arrayOf()

    /**
     * create variabel to add data produk in array
     */
    val produkYangDibeli = arrayOf("susu", "sate", "mie")

    /**
     * menyimpan berbagai tipe data dalam array
     */
    val detailProduk = arrayOf("susu", 1.5, 18000)

    /**
     * specific type int of array
     */
    val jumlahProdukYangDibeli = intArrayOf(5,1,2)

    // Create Array of lambda expression and constructor

    /**
     * create variabel to add data array in lambda expression
     */
    val bilanganKelipatanDua = Array(5) { it * 2 }

    // Menghitung jumlah harga pada suatu array
    val hargaBarang = intArrayOf(5000, 7000, 8000)
    var totalHarga = 0
    for (harga in hargaBarang) {
        totalHarga += harga
    }
    println(totalHarga)

    // Menggunakan foreach
    hargaBarang.forEach {
        totalHarga += it
    }
    println(totalHarga)

    // foreach indexed
    hargaBarang.forEachIndexed { index, harga ->
        println("Barang ke $index memiliki harga $harga")
    }
}