open class rectangel(
    var h: Int,
    var w: Int
) {
//    var h: Int = h
//    var w: Int = w
//
//    init {
//        this.h = h
//        this.w = w
//    }

    constructor(x1: Int, y1: Int, x2: Int, y2: Int):
        this(y2 - y1, x2 - x1) {
            println("build parameters")
        }

    public fun sq(): Int {
        return h * w
    }
}