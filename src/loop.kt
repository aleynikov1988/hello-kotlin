fun main() {
    val value: String? = readLine()

    if (value != null) {
        println("${zeroesCount(value)} zeroes")
    }
}

fun zeroesCount(s: String): Int {
    var count: Int = 0

    for (symbol in s) {
        if (symbol == '0') {
            count += 1
        }
    }
    return count
}