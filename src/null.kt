fun main() {
    val a: String? = readLine()
    var b: Int?

    // 1)
    if (a !== null)
        b = a.length

    // 2)
    b = a?.length

    // 3) Elvis
    b = a?.length ?: -1

    // 4) NullPointerException
    b = a!!.length

    println("length is $b")
}

