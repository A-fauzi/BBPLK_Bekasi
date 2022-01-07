package `Mobile-Application-And-Technology`.`UK-3`.Latihan

fun main() {
    val person = Person()
    person.greeting("Akhmad Fauzi", 24) {
            name: String, age: Int -> "Hello $name, your age is $age years old"
    }

    person.runPersonSpeed("Akhmad Fauzi", 20, 30)

}
class Person {
    fun greeting(name: String, age: Int, sayHello: (String, Int) -> Any): Any {
        if (age >= 17) println( sayHello(name, age))
        else println("your age is bellow to 17 years old")
        return sayHello
    }
    fun runPersonSpeed(name: String, speedRun: Int, jarak: Int): Any {
        val calculateSpeed: (Int, Int) -> Any = { speed, jrk ->
            println("""
            Hello $name, kamu berlari dengan kecepatan $speedRun Km/s
            Jarak tempuh kamu $jarak Km
            Kamu akan sampai dengan waktu tempuh ${speed * 60 / jrk} Mnt
        """.trimIndent())
        }

        return calculateSpeed(speedRun, jarak)
    }
}
