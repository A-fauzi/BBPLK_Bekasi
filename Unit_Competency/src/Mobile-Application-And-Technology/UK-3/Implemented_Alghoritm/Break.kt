package `Mobile-Application-And-Technology`.`UK-3`.Implemented_Alghoritm

fun main() {
    // Semua expression pada kotlin dapat di mark dengan sebuah label
    // Label memiliki penanda yang diawali dengan @ seperti abc@, anbidev@, foobar@ adalah label yang valid

    breakingTheLoop(2, 20)


}

fun breakingTheLoop(x: Int, y: Int){

    // Untuk melabeli sebuah expression, kita hanya tinggal menginput label didepan sebuah expression
    myLoop@ for (a in 1..x) {
        for (b in 1..y) {
            println("[$a] [$b]")
            if (b == 10) {
                break@myLoop
            }
        }
    }
}