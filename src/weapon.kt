open class weapon(
    var name: String,
    var bulletCount: Int = 0
) {
    open fun toShoot() {
        for (i in 1..bulletCount) {
            println("$name shooting -> $i")
        }
    }
}