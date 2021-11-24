package `Mobile-Application-And-Technology`.`UK-3`.Function

// Function to ouput
fun main() {
    println("Hello, World!")

// call greetings function
    println(greetings("Akhmad Fauzi"))

// call function parameter default value
    println(greetingsDefaultValue(age = 24))

// call single-expression function
    println(greetingsSingleExpression("Akhmad Fauzi"))
}

// Function Parameter
fun greetings(name: String): String {
    return "Hello $name"
}

// Function parameter default value
fun greetingsDefaultValue(name: String = "Anonymous", age: Int = 0): String {
    return "Hello $name, you are $age years old"
}

// Single-Expression Function
fun greetingsSingleExpression(name: String) = "Hello $name"