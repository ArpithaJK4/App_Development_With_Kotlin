fun getGreeting(): String {
    return "hello kotlin"
}

fun main() {
    println("hello World")
    println(getGreeting())
    sayhello(greeting = "hello", itemToGreet = "kotlin")
}

fun sayhello(greeting: String, itemToGreet: String) {
    println("$greeting $itemToGreet")
}
