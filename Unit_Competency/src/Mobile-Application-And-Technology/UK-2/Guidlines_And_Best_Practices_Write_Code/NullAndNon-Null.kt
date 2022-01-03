package `Mobile-Application-And-Technology`.`UK-2`.Guidlines_And_Best_Practices_Write_Code

fun main() {
    // Menyimpan null '?'
    var name: String? = "abcd"

    // Mengecek null '==null' atau '!=null'
    if (name == null) {
        println("name is null")
    } else {
        println("name is not null")
    }

    // safe calls
    val c: String? = null
    println(c?.length)

    // Elvis Operator '?:'
    val d = name?.length ?: -1
    println(d)

    // Not-Null Assertion operator '!!'
    val e = name!!.length
    println(e)

    // safe casts 'as?'
    val aInt: Int? = name as? Int
    println(aInt)
}