fun main() {
//    val r = rectangel(1, 2, 3, 4)
//    println("rectangle's sq is ${r.sq()}")

//    val p: player = player(strength = 1)
//
//    p.receiveExperience(10)
//    p.receiveExperience(100)
//    p.receiveExperience(200)

//    val s: square = square(10)
//    println("square's sq is ${s.sq()}")

//    val b: beretta = beretta()
//    b.toShoot()

    val storage = SugarStorage(100)
    storage.decreaseSugar(95)

    println(storage.volume)

    storage.increaseSugar(5)

    println(storage.volume)
}