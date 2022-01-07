package `Mobile-Application-And-Technology`.`UK-3`.Lambda

fun main() {
    /**
     * - Deklarasi variable operation yang nilai nya adalah argument dari lambda yang value nya sudah di inisialisasikan didalam function nya
     * - isi nilai variable nya dengan type unit lambda dengan deklarasi value 1 dan value 2 bertype String
     *
     */
    val operation = {operation1: String, operation2: String -> "Hello $operation1 dan $operation2"}

    // Panggil function nya beserta value pada parameter dengan jenis dan type data yang match / cocok
    // Isi Parameter ketiga dengan type lambda yang nilai nya sudah di deklarasikan pada variable operation
    lambdaArgument("Akhmad Fauzi", "Muhammad Zein", operation)
}

/**
 * - inisialisai param 1 dengan type data string
 * - inisialisai param 2 dengan type data string
 * - inisialisai param 3 dengan type lambda dengan parameter type data String, String
 */
fun lambdaArgument(striker1: String, striker2: String, operation: (String,String)->String): String {
    /**
     * - deklarasi variable result dengan nilai lambda yang sudah di inisialisasi pada parameter function nya
     * - value pada parameter lambda diisi dengan param 1 dan param 2 yang sudah di inisialisasikan pada function nya
     * - dan cetak variable result yang nilai nya adalah lambda
     * - return / kembalikan nilai lambda untuk function nya
     */
    val result = operation(striker1, striker2)
    println(result)
    return result
}