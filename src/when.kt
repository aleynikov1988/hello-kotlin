fun main() {
    val value: String? = readLine()
    var digit: Int? = null

    when (value) {
        "zero" -> digit = 0
        "one" -> digit = 1
        "two" -> digit = 2
        "three" -> digit = 3
        "four" -> digit = 4
        "five" -> digit = 5
        "six" -> digit = 6
        "seven" -> digit = 7
        "eight" -> digit = 8
        "nine" -> digit = 9
    }

    if (digit in 0..9) {
        println("You entered $digit")
    } else {
        println("Invalid value")
    }
}