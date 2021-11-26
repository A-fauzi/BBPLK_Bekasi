package `Mobile-Application-And-Technology`.`UK-3`.Latihan

fun main() {

    println(running())

}

fun runResult(name: String = "Anonymous", run: (Int, Int)-> Int): Any {
    val greetings = "Hello $name"

    val a = run (60, 10)

    when {
        a > 5 -> {
            println("Terlalu lama")
        }
        else -> {
            println("Sangat cepat")
        }
    }

    return "$greetings, Waktu tiba kamu ${a}jam"

}

fun running(): Any {
    val a = runResult("Akhmad Fauzi" ) {jarak, speed ->
        println("Jarak yang ditempuh ${jarak}Km,  kecepatan lari ${speed}Km/h")
        jarak / speed
    }

    return a
}