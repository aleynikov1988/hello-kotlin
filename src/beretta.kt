class beretta: weapon("Beretta 92", 15) {
    override fun toShoot() {
        println("ding")
        super.toShoot()
        println("dong")
    }
}