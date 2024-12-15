fun getGreeting(): String {
    return "hello kotlin"
}

fun main() {
    val interestingThings = arrayOf("kotlin", "programming", "comic Book")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEach {
        println(it)
    }
}
