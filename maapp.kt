fun getGreeting(): String {
    return "hello kotlin"
}

fun main() {
    val interestingThings = arrayOf("kotlin", "programming", "comic Book")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEach { item ->
        println(item)
    }

    val interestingList = mutableListOf("kotlin", "programming", "comic book")
    interestingList.add("Dog")
    println(interestingList)

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) ->
        println("$key -> $value")
    }
    map[4] = "d"
    println(map)
}
