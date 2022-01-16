fun main() {
    println("If you entered value of sum I will calc tax for them")

    val sum: String? = readLine()

    if (sum == null) {
        println("I cant calc tax because of sum is invalid")
        return
    }

    println("For $sum tax is: ${calcTax(sum.toInt())}")
}

fun calcTax(sum: Int, ratio: Double = .13): Double {
    return ratio * sum.toDouble()
}