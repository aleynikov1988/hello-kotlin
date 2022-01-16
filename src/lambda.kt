fun main() {
    val sum = { a: Int, b: Int -> a + b }
    val sum2: (Int, Int) -> Int = {x, y -> x + y}

    println("sum 3+5=${sum(3, 5)}")
    println("sum2 3+5=${sum2(3, 5)}")

    val ints: List<Int> = arrayListOf(0, 1, 2, 3)

    for (i in ints.filter { it > 0 }) {
        println("i=$i")
    }

    ints.filter {
        val shouldFiler = it > 0
        return@filter shouldFiler
    }
}