package `Mobile-Application-And-Technology`.`UK-3`.Lambda

fun main() {
//    Deklarasi Lambda
    var lamb: (Int, Int) -> Int

//    Memberikan nilai Integer dan mengembalikan integer
    lamb = {a: Int, b: Int -> a*b}

//    atau dapat disingkat
    lamb = {a, b -> a * b}

//    Menggunakan lamda mirip dengan menggunakan fungsi
    var addValueLamb = lamb(5, 5)
    println(addValueLamb)

//    untuk lambda dengan satu parameter dapat disingkat menggunakan it keyword
//    Lambda dengan satu parameter
    var lambdaOneParam = {a: Int -> 2 * a}

//    dapat disingkat
    lambdaOneParam = {
        it * 2
    }

    println(lambdaOneParam(5))

//    Call exmple function

    println(example("stiker1", "Stiker2") {name: String, grade: String ->
        "my name is $name and grade is $grade"
    })
}

//    Contoh
fun example(stiker1: String, stiker2: String, operation: (String, String)-> String): String {
    val result = operation(stiker1, stiker2)
    return result
}